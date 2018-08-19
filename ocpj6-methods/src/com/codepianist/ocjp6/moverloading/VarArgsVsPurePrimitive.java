/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist.ocjp6.moverloading;

/**
 * <h1>Test</h1> 
 * <p>created on: Aug 6, 2013, 9:49:10 PM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */

class Alien {
    String invade(short ships) { return "a few"; }
    String invade(short... ships) { return "many"; }
}
class Defender {
    public static void main(String [] args) {
        // System.out.println(new Alien().invade(7)); // larger to a smaller, needs cast
        System.out.println(new Alien().invade((short)7));
    }
}

