/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist.ocjp6.collections;

import java.util.Arrays;
import java.util.Map;
import java.util.NavigableSet;
import java.util.TreeSet;

/**
 * <h1>NavigableSetEx</h1> 
 * <p>created on: Aug 20, 2013, 1:08:56 PM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class NavigableSetEx {
    public static void main(String[] args) {
        NavigableSet<String> agenda = new TreeSet<String>(Arrays.asList("0800","1000","1230","1600","2200"));
        
        System.out.println("1:");
        System.out.println(agenda.lower("1230"));
        System.out.println(agenda.floor("1230"));
        
        System.out.println(agenda.higher("1230"));
        System.out.println(agenda.ceiling("1230"));
        
        System.out.println("\n2:");
        for(String s : agenda){
            System.out.printf("%s.\n",s);
        }
        System.out.println("\nreversing...");
        for(String s : agenda.descendingSet()){
            System.out.printf("%s.\n",s);
        }
        
        System.out.println("\n3:");
        while(agenda.size()>0){
            System.out.printf("geting# %s, total size: %d.\n",agenda.pollFirst(),agenda.size());
        }
    }
}
