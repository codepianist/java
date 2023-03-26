/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist.ocjp6.io;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * <h1>RenamingFile</h1> 
 * <p>created on: Aug 14, 2013, 10:43:05 PM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class RenamingFile {
    public static void main(String[] args) {
        File file = new File("_firstName.txt");
        try {
            System.out.println("Creating file...");
            if(!file.exists()) file.createNewFile();
            
            System.out.println("file:"+file.getName()+" exists? "+file.exists());
            
            System.out.println("Putting something on file...");
            PrintWriter pw = new PrintWriter(file);
            pw.println("sometjdasd");
            pw.flush();
            pw.close();
            
            
            System.out.println("Renaming file...");
            File renamedFile = new File("_newRenamedFile.txt");
            file.renameTo(renamedFile); // You can even rename directories if u wish
            
            System.out.println("file:"+file.getName()+" exists? "+file.exists());
            System.out.println("file:"+renamedFile.getName()+" exists? "+renamedFile.exists());
            
        } catch (IOException ex) {
            System.err.println("Some problem occured during file creating, writing or reading the file...");
            ex.printStackTrace();
        }
    }
}
