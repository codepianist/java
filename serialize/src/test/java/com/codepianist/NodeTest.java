package com.codepianist;

import org.junit.Test;

import java.io.*;



/**
 * Created by root on 17/10/17.
 */
public class NodeTest {

    private final String defaultPath(String suffix){
        return String.join("/","/home/cesar/Downloads",suffix);
    }

    @Test
    public void test(){
        try {
            System.out.println("Creating node...");
            Node node = new Node(defaultPath("test-serialize"));
            Serializable serializable = (Serializable) node;
            System.out.println("Serializing...");
            writeToFile(node, defaultPath("samples.o"));
            System.out.println("Serialized!");

            System.out.println("De-serializing...");
            Node node1 = readFromFile(defaultPath("samples.o"));
            node1.writeContentsToDir(defaultPath("deserialized"));
            System.out.println("Done!");
        }
        catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }

    }

    private static void writeToFile(Node node, String filepath)
            throws IOException {
        ObjectOutputStream oos = null;
        FileOutputStream fout = null;
        try {
            fout = new FileOutputStream(filepath, true);
            oos = new ObjectOutputStream(fout);
            oos.writeObject(node);
        } finally {
            if (oos != null) {
                oos.close();
            }
        }
    }

    private static Node readFromFile(String filepath)
            throws IOException, ClassNotFoundException {
        ObjectInputStream objectinputstream = null;
        FileInputStream streamIn = null;
        try {
            streamIn = new FileInputStream(filepath);
            objectinputstream = new ObjectInputStream(streamIn);
            Node node = (Node) objectinputstream.readObject();
            return node;
        } finally {
            if (objectinputstream != null) {
                objectinputstream.close();
            }
        }
    }

}