/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist.ocjp6.staticmodifier.static_members_r_inherited_too;

import static com.codepianist.ocjp6.staticmodifier.static_members_r_inherited_too.Father.s;

/**
 * <h1>Child</h1> 
 * <p>created on: Aug 5, 2013, 12:23:19 AM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class Child extends Father{
    public Child(String add) {
        super(add);
        printS();
    }
    static void printS(){
        System.out.printf("Child: %s.\n",s);
    }
}
