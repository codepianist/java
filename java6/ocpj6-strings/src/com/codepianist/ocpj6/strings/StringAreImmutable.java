/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist.ocpj6.strings;

/**
 * <h1>StringAreImmutable</h1> 
 * <p>created on: Aug 19, 2013, 4:28:00 PM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class StringAreImmutable {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = s1;
        
        System.out.printf("%s == %s? %b\n",s1,s2,(s1==s2));
        s1 += "de";
        
        System.out.printf("%s == %s? %b\n",s1,s2,(s1==s2));
    }
}
// run:
// abc == abc? true
// abcde == abc? false