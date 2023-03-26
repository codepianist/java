/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist;

/**
 * <h1>Animal</h1> 
 * <p>created on: Jul 31, 2013, 3:24:18 PM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public abstract class Animal {

    public void eat(String food){
        System.out.printf("Eating %s now...\n",food);
    }
    public void drink(String beverage){
        System.out.printf("Drinking %s now...\n",beverage);
    }
    public void breathe(){
        System.out.println("Always breathing, don't have to ask...");
    }
}
