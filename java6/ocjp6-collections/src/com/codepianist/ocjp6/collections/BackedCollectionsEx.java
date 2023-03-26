/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist.ocjp6.collections;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/**
 * <h1>BackedCollectionsEx</h1> 
 * <p>created on: Aug 20, 2013, 2:57:06 PM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class BackedCollectionsEx {
    public static void main(String[] args) {
        TreeMap<String, String> map = new TreeMap<String, String>();
        map.put("a", "ant"); map.put("d", "dog"); map.put("h", "horse"); map.put("l", "lion"); map.put("z", "zebra");
        //ex1(map);2
        ex2(map);
    }

    private static void ex1(TreeMap<String, String> map) {
        NavigableMap<String, String> submap = map.subMap("b", true, "l", true);
        
        System.out.println("1:");
        System.out.println("map: "+map);
        System.out.println("submap: "+submap);
        
        map.put("b", "bat");
        submap.put("f", "fish");
        map.put("m", "monkey");
        
        System.out.println("\n2:");
        System.out.println("map: "+map);
        System.out.println("submap: "+submap);
        
        System.out.println("\n3:");
        System.out.println("retirando: "+map.pollLastEntry());
        System.out.println("map: "+map);
        System.out.println("submap: "+submap);
        
        System.out.println(submap.getClass().getName());
    }

    private static void ex2(TreeMap<String, String> map) {
        Map<String,String> submap = map.tailMap("h");
        for(String s : submap.keySet())
            System.out.println("key: "+s);
    }
}
// run:
// 1:
// map: {a=ant, d=dog, h=horse, l=lion, z=zebra}
// submap: {d=dog, h=horse, l=lion}
//
// 2:
// map: {a=ant, b=bat, d=dog, f=fish, h=horse, l=lion, m=monkey, z=zebra}
// submap: {b=bat, d=dog, f=fish, h=horse, l=lion}
//
// 3:
// retirando: z=zebra
// map: {a=ant, b=bat, d=dog, f=fish, h=horse, l=lion, m=monkey}
// submap: {b=bat, d=dog, f=fish, h=horse, l=lion}
// java.util.TreeMap$AscendingSubMap
