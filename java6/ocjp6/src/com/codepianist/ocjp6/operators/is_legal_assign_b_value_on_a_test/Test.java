/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist.ocjp6.operators.is_legal_assign_b_value_on_a_test;

/**
 * <h1>Test</h1> 
 * <p>created on: Aug 7, 2013, 3:16:08 PM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class Test {
    public static void main(String[] args) {
        boolean b = false;
        if(b= true){
            System.out.println("passou");
        }else{
            System.out.println("nao passou");
        }
    }
}
