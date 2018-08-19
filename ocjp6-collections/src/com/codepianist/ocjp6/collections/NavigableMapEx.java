/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist.ocjp6.collections;

import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.TreeMap;

/**
 * <h1>NavigableMapEx</h1> 
 * <p>created on: Aug 20, 2013, 1:21:42 PM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class NavigableMapEx {
    public static void main(String[] args) {
        NavigableMap<String,String> agenda = new TreeMap<String,String>();
        agenda.put("0700","Wake Up");
        agenda.put("0800","Coffee");
        agenda.put("1100","Meeting");
        agenda.put("1230","Lunch Break");
        agenda.put("1600","Presentation");
        agenda.put("2300","Sleep");

        System.out.println("1:");
        System.out.println(agenda.lowerKey("1230")+": "+agenda.get(agenda.lowerKey("1230"))); // mais baixos, < x
        System.out.println(agenda.floorKey("1230")+": "+agenda.get(agenda.floorKey("1230"))); // mais baixos, <= x
        
        System.out.println(agenda.higherKey("1230")+": "+agenda.get(agenda.higherKey("1230"))); // mais baixos, > x
        System.out.println(agenda.ceilingKey("1230")+": "+agenda.get(agenda.ceilingKey("1230"))); // mais baixos, >= x
        
        System.out.println("\n2:");
        for(Entry<String,String> entry : agenda.entrySet()){
            System.out.printf("%s: %s.\n",entry.getKey(),entry.getValue());
        }
        System.out.println("\nreversing...");
        for(Entry<String,String> entry : agenda.descendingMap().entrySet()){
            System.out.printf("%s: %s.\n",entry.getKey(),entry.getValue());
        }
        
        System.out.println("\n3:");
        while(agenda.size()>0){
            Entry<String,String> entry = agenda.pollFirstEntry();
            System.out.printf("geting# %s: %s, total size: %d.\n",entry.getKey(),entry.getValue(),agenda.size());
        }
    }
}
