/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist;

/**
 * <h1>CommonMonkey</h1> 
 * <p>created on: Jul 31, 2013, 3:34:49 PM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class CommonMonkey extends Animal{

    @Override
    public void eat(String food) {
        if(!food.equalsIgnoreCase("banana")) System.out.printf("I can eat %s, but rather always prefer bananas...\n",food);
        else System.out.println("I love bananas, thank u!");
    }

    @Override
    public void drink(String beverage) {
        System.out.println("Only drink water, no matter what u ask me to drink...");
    }

}
