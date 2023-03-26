/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist.ocjp6.primitives;

/**
 * <h1>ComparingPrimitives</h1> 
 * <p>created on: Aug 13, 2013, 11:26:12 AM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class ComparingPrimitives extends Primitives{
    public static void main(String[] args) {

        
        // Comparacoes:
        // É possivel comparar todos os primitivos entre si, exceto boolean
        System.out.println("Comparações:\n");
        
        test(b == s,"b == s");
        test(b == i,"b == i");
        test(b == l,"b == l");
        test(b == f,"b == f");
        test(b == d,"b == d");
        test(b == c,"b == c");
        br();
        
        test(s == b,"s == b");
        test(s == i,"s == i");
        test(s == l,"s == l");
        test(s == f,"s == f");
        test(s == d,"s == d");
        test(s == c,"s == c");
        br();
        
        test(i == b,"i == b");
        test(i == s,"i == s");
        test(i == l,"i == l");
        test(i == f,"i == f");
        test(i == d,"i == d");
        test(i == c,"i == c");
        br();
        
        test(f == b,"f == b");
        test(f == s,"f == s");
        test(f == i,"f == i");
        test(f == l,"f == l");
        test(f == d,"f == d");
        test(f == c,"f == c");
        br();
        
        test(d == b,"d == b");
        test(d == s,"d == s");
        test(d == i,"d == i");
        test(d == l,"d == l");
        test(d == f,"d == f");
        test(d == c,"d == c");
        br();

    }
    static void test(boolean test, String descr){
        System.out.printf("%s resultou em %b\n",descr,test);
    }
    static void br(){
        System.out.println("");
    }
}
