/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist.ocjp6.collections.set;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * <h1>TreeSetEx</h1> 
 * <p>created on: Aug 20, 2013, 9:06:02 AM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class TreeSetEx {
    public static void main(String[] args) {
        SortedSet set = new TreeSet(Arrays.asList("Cavalo","Charrete","Carro","Caminhão"));
        for(Object o : set){
            System.out.println(o);
        }
    }
}
