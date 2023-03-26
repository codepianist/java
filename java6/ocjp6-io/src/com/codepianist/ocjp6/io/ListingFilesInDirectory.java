/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist.ocjp6.io;

import java.io.File;
import java.util.Arrays;
import java.util.List;

/**
 * <h1>ListingFilesInDirectory</h1> 
 * <p>created on: Aug 15, 2013, 12:10:17 AM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class ListingFilesInDirectory {
    public static void main(String[] args) {
        File containerDir = new File(".");
        List<String> fileNames = Arrays.asList(containerDir.list());
        for(String fileName :fileNames)
            System.out.println("file# "+fileName);
    }
}
