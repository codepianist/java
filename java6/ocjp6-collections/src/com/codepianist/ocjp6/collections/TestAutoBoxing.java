/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist.ocjp6.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * <h1>TestAutoBoxing</h1> 
 * <p>created on: Aug 20, 2013, 10:34:41 AM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class TestAutoBoxing {
    public static void main(String[] args) {
        System.out.println("1:");
        List list = new ArrayList();
        list.add(1);
        list.add(1l);
        list.add((short)1);
        for(Object o : list){
            System.out.println(o+", of type "+o.getClass().getName());
        }
        
        System.out.println("\n2:");
        List<Integer> li = new ArrayList<Integer>();
        li.add(1);
        short a =15;
        short b =14;
        li.add(a+b);
        // li.add((short)5); //narrowing and boxing
        for(Integer i : li){
            System.out.println(i+", of type "+i.getClass().getName());
        }
    }
}
