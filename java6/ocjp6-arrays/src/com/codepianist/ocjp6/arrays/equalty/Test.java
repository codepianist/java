/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist.ocjp6.arrays.equalty;

/**
 * <h1>Test</h1> 
 * <p>created on: Aug 7, 2013, 5:11:21 PM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class Test {
    public static void main(String[] args) {
        float f1 = 2.3f;
        float[][] f2 = {{42.0f}, {1.7f, 2.3f}, {2.6f, 2.7f}};
        float[] f3 = {2.7f};
        //if(f1==f2) System.out.println("true");
        //if(f3==f2) System.out.println("true");
        if(f3 == f2[2]) System.out.println("f3 == f2[2]? true");
        if(f3.equals(f3)) System.out.println("f3.equals(f3)? true");
        Long l1 = 42L;
        Long x = l1;
        long l2 = 42l;
        
        if(f1 == f2[2][1]); //2
        if(x == f2[0][0]); //3
        if(f1 == f2[1][1]); //4
        if(f3 == f2[2]); //5
        
        
        if(f2[0][0]==l1) System.out.println("f2[0][0]==l1? true");
        if(f2[0][0]==l2) System.out.println("f2[0][0]==l2? true");
        
        //Long[] long1 = {1,2,3}; // widening and boxing, too much
        Long[] long1 = {1l,2l,3l}; // Boxing
        long[] long2 = {1,2,3}; // Widening
    }
}
