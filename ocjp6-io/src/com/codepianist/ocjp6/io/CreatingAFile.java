/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist.ocjp6.io;

import java.io.File;
import java.io.IOException;

/**
 * <h1>CreatingAFile</h1> 
 * <p>created on: Aug 14, 2013, 6:18:21 PM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class CreatingAFile {
    public static void main(String[] args) {
        File f = new File("_cafEx.txt");
        prt( "File exists? "+f.exists() );
        try{
            if(!f.exists()){
                prt("creating file..");
                if(f.createNewFile()) prt("File successfully created!");
            }else{
                prt(f.getName()+" already exists");
            }

        }catch(IOException ex){
            System.err.println("Problem during creation of file: "+ex.getMessage());
            ex.printStackTrace();
        }
        prt( "File exists? "+f.exists() );
        
    }
    static void prt(String s){
        System.out.println(s);
    }
    static void prt(String v, String s){
        System.out.printf("Value of %s = %s.\n\n",v,s);
    }
}
