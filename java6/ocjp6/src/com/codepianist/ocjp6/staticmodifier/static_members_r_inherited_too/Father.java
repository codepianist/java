/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist.ocjp6.staticmodifier.static_members_r_inherited_too;

/**
 * <h1>Father</h1> 
 * <p>created on: Aug 5, 2013, 12:23:09 AM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class Father {
    protected Father(String add){
        s += add;
    }
    
    static String s = "a";
    static void printS(){
        System.out.printf("Father: %s.\n",s);
    }
}
