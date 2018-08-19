/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist.ocjp6.polymorphism;

/**
 * <h1>Test</h1> 
 * <p>created on: Aug 4, 2013, 9:30:55 PM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class Test {
    public static void main(String[] args) {
        Parent polimorphic = new Child();
        polimorphic.identify();
        System.out.println(polimorphic.luckNumber);
        System.out.println(polimorphic.getClass().getName());
    }
}
