/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist.ocpj6.assertions;

/**
 * <h1>ThisWillNotExecute</h1> 
 * <p>created on: Aug 13, 2013, 7:13:07 PM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class ThisWillNotExecute {
    public static void main(String[] args) {
        int a = 5;
        assert(pro()): "Opa";
        assert(++a>15);
        System.out.println("a= "+a);
    }
    static boolean pro(){
        System.out.println("protu");
        return true;
    }
}
