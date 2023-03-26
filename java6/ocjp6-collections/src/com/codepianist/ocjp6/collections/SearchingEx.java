/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist.ocjp6.collections;

import java.util.Arrays;

/**
 * <h1>SearchingEx</h1> 
 * <p>created on: Aug 20, 2013, 11:27:20 AM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class SearchingEx {
    public static void main(String[] args) {
        searching();
        // seachingWithoutSorting(); // don't do this
    }

    private static void searching() {
        String[] fruits = {"Banana", "Apple","Peach","Strawberry","Açaí"};
        Arrays.sort(fruits);
        
        int index = Arrays.binarySearch(fruits, "Banana");
        System.out.printf("U have a(n) %s at index %d.\n",fruits[index],index);
        
        String dontHaveThisFruit = "Coconut";
        int shouldBeIndex = Arrays.binarySearch(fruits, dontHaveThisFruit);
        System.out.printf("U don't have a(n) %s, but if u had, it'd be at index %d.\n",dontHaveThisFruit, (shouldBeIndex*-1));
    }
    private static void seachingWithoutSorting() {
        String[] fruits = {"Banana", "Apple","Peach","Strawberry","Açaí"};
        //Arrays.sort(fruits);
        
        int index = Arrays.binarySearch(fruits, "Açaí");
        System.out.printf("U have a(n) %s at index %d.\n",fruits[index],index); // java.lang.ArrayIndexOutOfBoundsException: -1
        
        String dontHaveThisFruit = "Coconut";
        int shouldBeIndex = Arrays.binarySearch(fruits, dontHaveThisFruit);
        System.out.printf("U don't have a(n) %s, but if u had, it'd be at index %d.\n",dontHaveThisFruit, (shouldBeIndex*-1));
    }
}
