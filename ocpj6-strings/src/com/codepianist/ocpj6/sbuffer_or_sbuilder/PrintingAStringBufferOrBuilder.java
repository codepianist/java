/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist.ocpj6.sbuffer_or_sbuilder;

/**
 * <h1>PrintingAStringBufferOrBuilder</h1> 
 * <p>created on: Aug 19, 2013, 4:07:15 PM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class PrintingAStringBufferOrBuilder {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("chocolate");
        StringBuffer sb2 = new StringBuffer(" com amendoas");
        System.out.println(sb1+""+sb2);
    }
}
// run:
// chocolate com amendoas