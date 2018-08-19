/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist.ocjp6.staticmodifier.with_polimorphism;

/**
 * <h1>Dog</h1> 
 * <p>created on: Aug 4, 2013, 8:06:27 PM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class Dog extends Animal{
    // @Override // other method, static method is not interited
    public static void identify(){
        System.out.println("Dog");
    }
}
