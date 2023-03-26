/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist;

/**
 * <h1>BrazilianMonkey</h1> 
 * <p>created on: Jul 31, 2013, 3:26:43 PM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class BrazilianMonkey extends Animal{
    
    @Override
    public void eat(String food){
        System.out.printf("Don't like %s, better have a Burger...\n",food); 
    }

    @Override
    public void drink(String beverage) {
        System.out.printf("Don't like %s, better have a Beer...\n",beverage);
    }
    
    public void getDrunk(){
        System.out.println("Always drinking, but never getting drunk.");
        System.out.println("Malandro is malandro, mané is mané.");
    }
}
