/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist.ocpj6.sbuffer_or_sbuilder;

/**
 * <h1>StringBufferMethods</h1> 
 * <p>created on: Aug 14, 2013, 5:15:14 PM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class StringBufferMethods {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("banana");
        
        sb.append(" with chocolate");
        prt(sb);
        
        sb.delete(5, 16);
        prt(sb);
        
        sb.insert(6,"suco");
        prt(sb);
        
        sb.reverse();
        prt(sb);
        
    }
    static void prt(StringBuffer s){
        System.out.println(s.toString());
    }
    static void prt(String v, StringBuffer s){
        System.out.printf("Value of %s = %s.\n\n",v,s.toString());
    }
}
// run:
// banana with chocolate
// bananolate
// bananosucolate
// etalocusonanab