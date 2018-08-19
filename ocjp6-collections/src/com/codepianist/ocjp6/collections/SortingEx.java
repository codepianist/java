/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist.ocjp6.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * <h1>SortingEx</h1> 
 * <p>created on: Aug 20, 2013, 10:38:06 AM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class SortingEx {
    public static void main(String[] args) {
        // sortingString(); //OK
        // sortingObjectWithoutComparable(); // java.lang.ClassCastException
        sortingObjectWithComparable();
    }

    private static void sortingString() {
        List list = new ArrayList();
        list.add("Paulo");
        list.add("José");
        list.add("Amanda");
        list.add("Xuxa");
        list.add("Carlos");
        
        System.out.println("1:");
        for(Object o : list){
            System.out.println(o);
        }
        
        System.out.println("\n2:");
        Collections.sort(list);
        for(Object o : list){
            System.out.println(o);
        }
    }
    private static void sortingObjectWithoutComparable(){
        List list = new ArrayList();
        list.add(new PersonNotImplementsComparable("Paulo"));
        list.add(new PersonNotImplementsComparable("José"));
        list.add(new PersonNotImplementsComparable("Amanda"));
        list.add(new PersonNotImplementsComparable("Xuxa"));
        list.add(new PersonNotImplementsComparable("Carlos"));
        
        System.out.println("1:");
        for(Object o : list){
            System.out.println(o);
        }
        
        System.out.println("\n2:");
        Collections.sort(list);
        for(Object o : list){
            System.out.println(o);
        }
    }
    private static void sortingObjectWithComparable(){
        List list = new ArrayList();
        list.add(new PersonImplementsComparable("Paulo"));
        list.add(new PersonImplementsComparable("José"));
        list.add(new PersonImplementsComparable("Amanda"));
        list.add(new PersonImplementsComparable("Xuxa"));
        list.add(new PersonImplementsComparable("Carlos"));
        
        System.out.println("1:");
        for(Object o : list){
            System.out.println(o);
        }
        
        System.out.println("\n2:");
        Collections.sort(list);
        for(Object o : list){
            System.out.println(o);
        }
    }
}
