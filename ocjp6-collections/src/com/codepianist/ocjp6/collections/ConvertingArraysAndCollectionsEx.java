/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist.ocjp6.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <h1>ConvertingArraysAndCollectionsEx</h1> 
 * <p>created on: Aug 20, 2013, 11:40:05 AM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class ConvertingArraysAndCollectionsEx {
    public static void main(String[] args) {
        // tryToRemove();
        tryToChange();
    }

    private static void tryToRemove() {
        String[] fruits = {"Banana", "Apple","Peach","Strawberry","Açaí"};
        // Arrays.asList: Returns a fixed-size list backed by the specified array.
        // List<String> list = Arrays.asList(fruits); // UnsupportedOperationException // can't remove
        List<String> list = new ArrayList<String>(Arrays.asList(fruits));
        list.remove("Peach");
        
        
        System.out.println("Array:");
        for(String s: fruits){
            System.out.println(s);
        }
        
        System.out.println("\nList:");
        for(String s: list){
            System.out.println(s);
        }
    }
    private static void tryToChange() {
        String[] fruits = {"Banana", "Apple","Peach","Strawberry","Açaí"};
        List<String> list = Arrays.asList(fruits);
        fruits[3] = "Avocado";
        list.set(2,"Papaya");
        
        System.out.println("Array:");
        for(String s: fruits){
            System.out.println(s);
        }
        
        System.out.println("\nList:");
        for(String s: list){
            System.out.println(s);
        }
    }
}
