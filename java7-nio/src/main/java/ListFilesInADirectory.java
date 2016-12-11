import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by root on 10/12/16.
 */
public class ListFilesInADirectory {

    /**
     * Lists all inner directories
     * @param rootDirectory
     * @param includeRoot
     * @throws IOException
     */
    public static List<Path> listDirectories(Path rootDirectory, boolean includeRoot){
        List<Path> result= new ArrayList<>();
        if(!Files.isDirectory(rootDirectory))
            throw new RuntimeException("rootDirectory must be a directory!");
        if(includeRoot)
            result.add(rootDirectory);
        try {
            DirectoryStream<Path> stream = Files.newDirectoryStream(rootDirectory);
            stream.forEach(content -> {
                if (Files.isDirectory(content))
                    result.addAll(listDirectories(content, true));
            });
        }catch (IOException ex){
            ex.printStackTrace();
        }
        return result;
    }

    public static List<Path> listDirectories(Path rootDirectory, boolean includeRoot, String pathMatcherStr){
        List<Path> result= listDirectories(rootDirectory, includeRoot);
        result= result
                .stream()
                .filter(p-> {
                    try (DirectoryStream<Path> stream= Files.newDirectoryStream(p,pathMatcherStr)){
                        boolean containsPattern= stream.iterator().hasNext();
                        return containsPattern;
                    }catch (IOException ex){
                        ex.printStackTrace();
                        return false;
                    }
                })
                .collect(Collectors.toList());
        return result;
    }

    public static List<Path> listFiles(Path rootDirectory, boolean includeInnerDirectories, Optional<String> pathMatcherStr){
        List<Path> directories, result= new ArrayList<>();
        if(!Files.isDirectory(rootDirectory))
            throw new RuntimeException("rootDirectory must be a directory!");

        // Get directories
        if(includeInnerDirectories)
            directories =pathMatcherStr.isPresent() ?
                    listDirectories(rootDirectory, true, pathMatcherStr.get()) :
                    listDirectories(rootDirectory, true);
        else
            directories= new ArrayList(){{
                add(rootDirectory);
            }};
        System.out.println(directories.size());

        directories.forEach(d-> {
            try ( DirectoryStream<Path> stream = pathMatcherStr.isPresent() ?
                    Files.newDirectoryStream(d, pathMatcherStr.get()) :
                    Files.newDirectoryStream(d) ) {

                stream.forEach(content -> {
                    if(Files.isRegularFile(content)){
                        if(pathMatcherStr.isPresent()) {
                            String glob= String.join("", "glob:/**/", pathMatcherStr.get()).toString();
                            PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
                            if (matcher.matches(content))
                                result.add(content);
                        }
                        else
                            result.add(content);
                    }
                });

            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });
        return result;
    }

}
