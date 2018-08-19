/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist.ocjp6.io;

import static com.codepianist.ocjp6.io.CreatingAFile.prt;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

/**
 * <h1>WrintingAndReadingLowLevel</h1> 
 * <p>created on: Aug 14, 2013, 7:41:01 PM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class WrintingAndReadingLowLevel extends CreatingAFile {
   
    public static void main(String[] args) {
        File file = new File("_wrllEx.txt");
        try {
            prt("\nWriting data to file...");
            FileWriter fw = new FileWriter(file); // creates a file, if it doesn't exists
            fw.write("Want to pass on exam\nGod, please, help me"); // write the data
            fw.flush(); // ensure that the data was completely writen
            fw.close(); // close the stream, and release the OS resources
            
            prt("\nReading data from file...");
            FileReader fr = new FileReader(file);
            char[] buf = new char[50];
            int size = fr.read(buf);
            
            prt("Ajusting for size: "+size);
            StringBuilder sb = new StringBuilder();
            for(int i= 0 ;i<size; i++)
                sb.append(buf[i]);
            
            prt("read: "+sb.toString());
            fr.close();
            
        } catch (IOException ex) {
            System.err.println("Some problem occured during file creating, writing or reading the file...");
            ex.printStackTrace();
        } 
        
    }
}
