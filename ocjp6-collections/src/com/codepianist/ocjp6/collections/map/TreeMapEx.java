/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist.ocjp6.collections.map;

import com.codepianist.ocjp6.collections.PersonImplementsComparable;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * <h1>TreeMapEx</h1> 
 * <p>created on: Aug 20, 2013, 10:13:12 AM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class TreeMapEx {
    public static void main(String[] args) {
        SortedMap map = new TreeMap();
        map.put(new PersonImplementsComparable("Zuleica"), "Carro");
        map.put(new PersonImplementsComparable("Maria"), "Charrete");
        map.put(new PersonImplementsComparable("Amanda"), "Cavalo");
        // map.put(null, "Caminhão"); // java.lang.NullPointerException
        
        for(Object o : map.keySet()){
            PersonImplementsComparable p = (PersonImplementsComparable)o;
            System.out.println(p+" tem um(a) "+map.get(o));
        }
    }
}
