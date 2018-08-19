/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist.ocjp6.polymorphism;

/**
 * <h1>Child</h1> 
 * <p>created on: Aug 4, 2013, 9:30:10 PM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class Child extends Parent{
    
    protected int luckNumber = 55; 
    
    @Override
    public void identify(){
        System.out.println("Child");
    }
}
