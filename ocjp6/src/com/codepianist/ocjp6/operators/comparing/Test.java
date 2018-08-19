/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist.ocjp6.operators.comparing;

/**
 * <h1>Test</h1> 
 * <p>created on: Aug 7, 2013, 5:21:01 PM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class Test {
    public static void main(String[] args) {
        float[][] f2 = {{42.0f}, {1.7f, 2.3f}, {2.6f, 2.7f}};
        Long l1 = 42L;
        long l2 = 42l;
        if(f2[0][0]==l1) System.out.println("true");
        if(f2[0][0]==l2) System.out.println("true");
    }
}
