/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist.ocpj6.strings;

/**
 * <h1>StringConstantPool</h1> 
 * <p>created on: Aug 14, 2013, 4:02:38 PM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class StringConstantPool {
    public static void main(String[] args) {
        String s = "a";
        String s2 = "a";
        if(s==s2) prt("equal!"); else prt("not equal.");
        if(s.equals(s2)) prt("equal!"); else prt("not equal.");
        br();
        
        s2= new String("a");
        if(s==s2) prt("equal!"); else prt("not equal.");
        if(s.equals(s2)) prt("equal!"); else prt("not equal.");
        
    }
    static void prt(String s){
        System.out.println(s);
    }
    static void prt(String v, String s){
        System.out.printf("Value of %s = %s.\n\n",v,s);
    }
    static void br(){
        System.out.println();
    }
}
// run:
// equal!
// equal!
//
// not equal.
// equal!