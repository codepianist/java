/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist.ocjp6.primitives;

/**
 * <h1>IntegerLiteralsAreInt</h1> 
 * <p>created on: Aug 5, 2013, 10:31:26 AM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class IntegerLiteralsAreInt {
    public static void main(String[] args) {
        byte a = 27;
        byte b = 4;
        
        byte c = 27 + 4;
        // byte d = a + b; // possible loss of precision
        byte d = (byte) (a + b);
        
        long l = 130l;
        byte bl = (byte)l;
        System.out.println(bl);
    }
}
