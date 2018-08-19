/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist.ocjp6.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * <h1>ConcurrentModificationException</h1> 
 * <p>created on: Aug 21, 2013, 3:23:28 PM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class ConcurrentModificationException {
    public static void main(String[] args) {
        List<String> l = new ArrayList<String>(
            Arrays.asList("Java","Python","Javascript","Go","Closure")
        ); 
        Iterator<String> i = l.iterator();
        l.add("Ruby");
        
        while(i.hasNext())
            System.out.println(i.next());
    }
}
// ConcurrentModificationException
