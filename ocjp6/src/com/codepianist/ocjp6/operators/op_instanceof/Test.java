/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist.ocjp6.operators.op_instanceof;

/**
 * <h1>Test</h1> 
 * <p>created on: Aug 7, 2013, 3:38:46 PM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class Test {
    public static void main(String[] args) {
        ClassA ab = new ClassB();
        if(ab instanceof ClassA){
            System.out.println("ab is a ClassA");
        }
        if(ab instanceof ClassB){
            System.out.println("ab is a ClassB");
        }
        if(ab instanceof InterfaceNothing){
            System.out.println("ab implements InterfaceNothing");
        }
        
        ClassB bb = new ClassB();
        if(bb instanceof ClassA){
            System.out.println("bb is a ClassA");
        }
        if(bb instanceof ClassB){
            System.out.println("bb is a ClassB");
        }
        if(bb instanceof InterfaceNothing){
            System.out.println("bb implements InterfaceNothing");
        }
        
        // if(bb instanceof String){} // illegal
        
    }
}
