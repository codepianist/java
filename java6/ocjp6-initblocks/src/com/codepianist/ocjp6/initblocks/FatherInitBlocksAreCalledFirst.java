/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist.ocjp6.initblocks;

/**
 * <h1>Test</h1> 
 * <p>created on: Aug 6, 2013, 10:02:27 PM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
class Bird {
    { System.out.print("(ib)b1 "); }
    public Bird() { System.out.print("(c)b2 "); }
    static { System.out.print("(sb)bsb "); }
}
class Raptor extends Bird {
    static { System.out.print("(sb)r1 "); }
    public Raptor() { System.out.print("r2 "); }
    { System.out.print("(ib)r3 "); }
    static { System.out.print("(sb)r4 "); }
}
class Hawk extends Raptor {
    public static void main(String[] args) {
        System.out.print("pre ");
        new Hawk();
        System.out.println("hawk ");
    }
}

