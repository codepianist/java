/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist.ocjp6.arrays.initializ_w_default_value;

/**
 * <h1>Test</h1> 
 * <p>created on: Aug 5, 2013, 12:55:20 PM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class Test {
    // static int [] year; // java.lang.NullPointerException would be thrown initialized as null
    static int [] year = new int[100];
    public static void main(String [] args) {
      for(int i=0;i<100;i++)
        System.out.println("year[" + i + "] = " + year[i]);
    }
}
