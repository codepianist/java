/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist.ocjp6.io;

import static com.codepianist.ocjp6.io.CreatingAFile.prt;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * <h1>WrintingAndReadingHighLevel</h1> 
 * <p>created on: Aug 14, 2013, 8:31:54 PM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class WrintingAndReadingHighLevel extends CreatingAFile {
    public static void main(String[] args) {
        File file = new File("_wrhlEx.txt"); 
        try {
            prt("Writing to file...");
            FileWriter fw = new FileWriter(file);
            PrintWriter pw = new PrintWriter(fw, true); // autoflush true
            pw.println("I'll pass the exam");
            pw.println("For sure.");
            pw.close(); // automatically closes the writer within
            
            // Reading from file...
            prt("Reading from file...");
            FileReader fr = new FileReader(file); 
            BufferedReader br = new BufferedReader(fr);
            while(br.ready()){
                prt(br.readLine());
            }
            br.close(); // automatically closes the reader within
            
        } catch (IOException ex) {
            System.err.println("Some problem occured during file creating, writing or reading the file...");
            ex.printStackTrace();
        }
        
    }
}
