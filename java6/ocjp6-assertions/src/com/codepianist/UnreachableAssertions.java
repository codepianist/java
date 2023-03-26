/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist;

/**
 * <h1>UnreachableAssertions</h1> 
 * <p>created on: Aug 13, 2013, 2:32:51 PM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class UnreachableAssertions {
    public static void main(String[] args) {

    }
    static int m(Object value){
        if(value==null){
            return 1;
        }else{
            return 2;
        }
        //assert(true); // unreachable
        //assert(15>5) : "Vai se fu..."; // unreachable
    }
}
