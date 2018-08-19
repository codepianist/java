/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist.ocjp6.io;

import java.io.File;
import java.io.IOException;

/**
 * <h1>DeletingFile</h1> 
 * <p>created on: Aug 14, 2013, 10:39:45 PM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class DeletingFile {
    public static void main(String[] args) {
        File file = new File("_toberemoved.txt");
        try{
            System.out.println("Creating file...");
            if(!file.exists()) file.createNewFile();
            
            System.out.println("File exists? "+file.exists());
            
            System.out.println("Removing file...");
            file.delete(); // can remove files and empty directories
            // must empty the directory before deleting it
            
            System.out.println("File exists? "+file.exists());
            
        }catch(IOException ex){
            System.err.println("Some problem occured during file creating, writing or reading the file...");
            ex.printStackTrace();
        }
    }
}
