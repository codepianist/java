/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist.ocjp6.initblocks;

/**
 * <h1>VariableInitialization</h1> 
 * <p>created on: Aug 13, 2013, 5:56:55 PM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class VariableInitialization {
    static int x = 7;
    public static void main(String[] args) {
        System.out.println("x="+x);
        System.out.println("x="+new VariableInitialization().x);
    }
    { x++; }
    static{ x++; }
    public VariableInitialization() { x++; }
}
// run:
// x=8
// x=10