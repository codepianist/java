/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist.ocjp6.staticmodifier.with_polimorphism;

/**
 * <h1>Test</h1> 
 * <p>created on: Aug 4, 2013, 8:07:56 PM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class Test {
    public static void main(String[] args) {
        Animal animals[] = {new Animal(), new Animal(), new Dog()};
        for(int index= 0; index<animals.length; index++)
            animals[index].identify();
    }
}
