/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist.ocjp6.moverloading;

/**
 * <h1>WidenAndBox</h1> 
 * <p>created on: Aug 6, 2013, 5:38:39 PM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class WidenAndBox {
    static void doSomething(Long l){
        System.out.println("Long");
    }
    public static void main(String[] args) {
        long l = 150;
        doSomething(l);
        byte b = 5;
        //doSomething(b); // trying to widen than box -- illegal
    }
}
