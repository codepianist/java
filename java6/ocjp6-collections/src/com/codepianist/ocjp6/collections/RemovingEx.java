/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist.ocjp6.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Vector;

/**
 * <h1>RemovingEx</h1> 
 * <p>created on: Aug 20, 2013, 11:44:35 AM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class RemovingEx {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<String>();
        List<String> linkedList = new LinkedList<String>();
        List<String> vector = new Vector<String>();
        Set<String> hashSet = new HashSet<String>();
        Set<String> linkedHashSet = new LinkedHashSet<String>();
        SortedSet<String> treeSet = new TreeSet<String>();
        Queue<String> priorityQueue = new PriorityQueue<String>(); 
        
        tryToRemove(arrayList);
        tryToRemove(linkedList);
        tryToRemove(vector);
        tryToRemove(hashSet);
        tryToRemove(linkedHashSet);
        tryToRemove(treeSet);
        tryToRemove(priorityQueue);
        
    }
    private static void populate(Collection<String> c){
        c.add("One");
        c.add("Two");
        c.add("Three");
        c.add("Four");
        c.add("Five");
    }
    private static void print(Collection<String> c){
        for(String s: c) System.out.print(s+", ");
        System.out.println("");
    }

    private static void tryToRemove(Collection<String> c) {
        System.out.println("\ntesting: "+c.getClass().getName());
        populate(c);
        print(c);
        c.remove("Two");
        print(c);
    }
}
