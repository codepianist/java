/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist.ocjp6.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * <h1>SortingExUsingCompator</h1> 
 * <p>created on: Aug 20, 2013, 11:12:11 AM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class SortingExUsingCompator {
    public static void main(String[] args) {
        sortingObjectWithComparator();
    }
    private static void sortingObjectWithComparator(){
        List list = new ArrayList();
        list.add(new PersonWithComparator("Paulo",35));
        list.add(new PersonWithComparator("José",18));
        list.add(new PersonWithComparator("Amanda",19));
        list.add(new PersonWithComparator("Xuxa",62));
        list.add(new PersonWithComparator("Carlos",32));
        
        System.out.println("1:");
        for(Object o : list){
            System.out.println(o);
        }
        
        System.out.println("\n2:");
        Collections.sort(list,PersonWithComparator.COMPARE_BY_NAME);
        for(Object o : list){
            System.out.println(o);
        }
        // Collections.binarySearch(list, new PersonWithComparator("Amanda",19)); // ClassCastException
        Collections.binarySearch(list, new PersonWithComparator("Amanda",19),PersonWithComparator.COMPARE_BY_NAME);
        
        System.out.println("\n3:");
        Collections.sort(list,PersonWithComparator.COMPARE_BY_AGE);
        for(Object o : list){
            System.out.println(o);
        }
    }
}
