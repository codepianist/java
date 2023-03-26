/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist.ocjp6.arrays.initializ_w_default_value;

/**
 * <h1>TestDeclaring</h1> 
 * <p>created on: Aug 6, 2013, 8:48:28 PM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class TestDeclaring {
    public static void main(String[] args) {
        declaring1();
    }

    private static void declaring1() {
        int[][] a = {{1,2,}, {3,4},};
        for(int[] ia : a){
            System.out.println("-");
            for(int i : ia)
                System.out.printf("i: %d.\n",i);
        }
        
        Object o = a;
        int[] b = (int[])o;
        System.out.println("b:"+b);
    }
}
