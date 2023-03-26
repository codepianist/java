/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist.ocjp6.operators.op_plus;

/**
 * <h1>Test2</h1> 
 * <p>created on: Aug 7, 2013, 5:34:33 PM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class Test2 {
    public static void main(String[] args) {
        Long x = 42L;
        Long y = 44L;
        System.out.print(" " + 7 + 2 + " ");
        System.out.print(foo() + x + 5 + " ");
        System.out.println(x + y + foo());
    }
    static String foo() { return "foo"; }
}

