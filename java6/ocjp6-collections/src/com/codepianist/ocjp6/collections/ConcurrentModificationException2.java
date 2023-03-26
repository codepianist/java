/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist.ocjp6.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * <h1>ConcurrentModificationException2</h1> 
 * <p>created on: Aug 21, 2013, 3:06:22 PM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class ConcurrentModificationException2 {
    public static void main(String[] args) {
        String[] array = {"Java","Python","Pearl","Ada","Javascript","Go","Closure"};
        subListEx(array);
        subSetEx(array);
    }

    private static void subListEx(String[] array) {
        List<String> l = new ArrayList<String>(Arrays.asList(array));
        List<String> l2 = l.subList(2, 4);
        System.out.println(l.getClass().getName());
        
        // l.add("Doce"); // ConcurrentModificationException
        // l.remove(2); // ConcurrentModificationException
        l2.remove("Ada"); // OK
        for (String s:l) { System.out.print(s+", "); } 
        System.out.println();
        for (String s:l2) { System.out.print(s+", "); }
    }

    private static void subSetEx(String[] array) {
        SortedSet<String> s1 = new TreeSet<String>(Arrays.asList(array));
        SortedSet<String> s2 = s1.subSet("Java", "Pyton");
        s1.remove("Pearl");
        
        for (String s:s1) { System.out.print(s+", "); } 
        System.out.println();
        for (String s:s2) { System.out.print(s+", "); }
    }
}
