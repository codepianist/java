/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist.ocjp6.staticmodifier.static_members_r_inherited_too;

/**
 * <h1>Test</h1> 
 * <p>created on: Aug 5, 2013, 12:40:46 AM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class Test {
    public static void main(String[] args) {
        Father c = new Child("Big");
        c.printS();
        c.s = "15";
        c.printS();
    }
}
