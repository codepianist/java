/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist.ocpj6.strings;

/**
 * <h1>StringMethods</h1> 
 * <p>created on: Aug 14, 2013, 3:42:49 PM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class StringMethods {
    public static void main(String[] args) {
        String s = "coração";
        prt(s.concat(s));
        prt("s",s);
        
        prt(s.intern());
        prt("s",s);
        
        prt(s.replace("o","x"));
        prt("s",s);
        
        prt(s.substring(0,3));
        prt("s",s);
        
        prt(s.toUpperCase());
        prt("s",s);
        
        prt(s.toLowerCase());
        prt("s",s);
        
        prt(s.trim());
        prt("s",s);
        
        prt(s.toString());
        prt("s",s);
        
        s += ", agora foi!"; 
        prt(s);
        
    }
    static void prt(String s){
        System.out.println(s);
    }
    static void prt(String v, String s){
        System.out.printf("Value of %s = %s.\n\n",v,s);
    }
}

// run:
// coraçãocoração
// Value of s = coração.
//
// coração
// Value of s = coração.
//
// cxraçãx
// Value of s = coração.
//
// cor
// Value of s = coração.
//
// CORAÇÃO
// Value of s = coração.
//
// coração
// Value of s = coração.
//
// coração
// Value of s = coração.
//
// coração
// Value of s = coração.
//
// coração, agora foi!
