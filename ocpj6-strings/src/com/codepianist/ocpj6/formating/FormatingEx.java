/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist.ocpj6.formating;

/**
 * <h1>FormatingEx</h1> 
 * <p>created on: Aug 19, 2013, 1:12:20 PM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class FormatingEx {
    public static void main(String[] args) {
        System.out.format("%3$s,%2$d\n","primeiro",2,"terceiro");
        System.out.format("%(10.3f\n",-2.987654321);
        System.out.println("1234567890");
        // System.out.format("%d", 12.3); // IllegalFormatConversionException
    }
}
// run:
// terceiro,2
//      2.988
// 1234567890
