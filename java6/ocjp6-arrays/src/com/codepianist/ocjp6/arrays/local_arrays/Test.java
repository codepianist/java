/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist.ocjp6.arrays.local_arrays;

/**
 * <h1>Test</h1> 
 * <p>created on: Aug 5, 2013, 1:26:08 PM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class Test {
    public static void main(String[] args) {
        int[] a = null;
        for(int c : a){ // runtime exception
            System.out.println(c);
        }
        
        
        //Thread[] threads = new Thread[]; // don't compile
        Thread[] threads = new Thread[5]; // Thread constructor has not been called yet, here.
        
        int[][] myArray = new int[3][]; // no casos de arrays multidimensionais, java so precisa saber o tamanho do o array raiz
        int[][] scores = {{5,2,4,7}, {9,2}, {3,4}};
        
        // int [] testScores = new int[3] {4,7,2}; // not legal
        int [] testScores = new int[] {4,7,2}; // initializing
        
        Object[] objs = new Object[]{"d",5,new Thread(),new int[5]};
        
        int[] weightList = new int[5];
        
        byte b = 4;
        char c = 'c';
        short s = 7;
        weightList[0] = b;  // OK, byte is smaller than int
        weightList[1] = c;  // OK, char is smaller than int
        weightList[2] = s;  // OK, short is smaller than int

        int[] splats;
        int[] dats = new int[4];
        char[] letters = new char[5];
        splats = dats; // OK, dats refers to an int array
        //splats = letters; // NOT OK, letters refers to a char array
        
        Car[] cars = new Car[]{new Car("Fusca"), new Car()};
        Honda[] hondas = new Honda[]{new Honda("Civic"),new Honda()};
        cars = hondas;
    }
}
