/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist.ocjp6.operators.op_plus;

/**
 * <h1>Test</h1> 
 * <p>created on: Aug 7, 2013, 4:10:17 PM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class Test {
    public static void main(String[] args) {
        String a = "String";
        int b = 5;
        int c = 5;
        System.out.println(a + b + c);
        System.out.println(a + (b + c));
        
        String s = "123";
        s += "45";
        s += 67;
        System.out.println(s);
    }
    
}
