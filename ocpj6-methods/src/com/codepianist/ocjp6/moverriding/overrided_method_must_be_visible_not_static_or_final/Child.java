/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist.ocjp6.moverriding.overrided_method_must_be_visible_not_static_or_final;

/**
 * <h1>Child</h1> 
 * <p>created on: Aug 4, 2013, 11:50:33 PM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class Child extends Father{
    // @Override // not an override
    private void privateM(){
        System.out.println("privateM()");
    }
    @Override
    public void publicM(){
        System.out.println("publicM()");
    }
    // @Override // not an override
    public static void staticM(){
        System.out.println("staticM");
    }
    /*
    public final void finalM(){
        System.out.println("finalM");
    }
    */
}
