/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist.ocjp6.io;

import static com.codepianist.ocjp6.io.CreatingAFile.prt;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * <h1>CreatingADirectoryWritingAndReading</h1> 
 * <p>created on: Aug 14, 2013, 9:19:47 PM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class CreatingADirectoryWritingAndReading extends CreatingAFile{
    public static void main(String[] args) {
        File dir = new File("_cadEx");
        try {
            prt("Creating directory");
            if(!dir.exists()) dir.mkdir();
            // if(!dir.exists()) dir.mkdirs(); // creates directory and parents
            
            prt("Writing to file");
            File f = new File(dir,"_fileWithin.txt");
            PrintWriter pw = new PrintWriter(f);
            pw.println("Eu me amo.");
            pw.println("Vai Corinthians.");
            pw.flush();
            pw.close();
            
            prt("Reading from file");
            BufferedReader br = new BufferedReader(new FileReader(f));
            String s;
            while((s = br.readLine()) != null){
                prt(s);
            }
            br.close();
            
            
        } catch (IOException ex) {
            System.err.println("Some problem occured during file creating, writing or reading the file...");
            ex.printStackTrace();
        }
    }
}
