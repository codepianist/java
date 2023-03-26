/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist.ocjp6.primitives;

import static com.codepianist.ocjp6.primitives.Primitives.d;

/**
 * <h1>AssigningPrimitives</h1> 
 * <p>created on: Aug 13, 2013, 12:29:32 PM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class AssigningPrimitives extends Primitives{
    
    public static void main(String[] args) {
        // Atribuicoes
        System.out.println("Atribuições:\n");
        // Menor p/ Maior (Narrowing), Inteiro p/ Flutuante, e iguais OK.
        // O inverso só com cast.
        // Excecoes:    Nao pode atribuir nada exceto literal até 65535 para um char.
        //              Um short nao pode receber um char.
        
        
        // b = s;
        // b = i;
        // b = l;
        // b = f;
        // b = l;
        // b = c;
        
        // s = i;
        // s = l;
        // s = f;
        // s = l;
        // s = c;   // char: 0 to 2^16 - 1 (0 to 65535) short 
                    // short: -2^15 to 2^15 - 1 (−32,768 to 32,767)
        
        // i = l;
        // i = f;
        // i = d;

        // l = f;
        // l = d;
        
        // Menor para maior, inteiro para flutuante.
        d = b;
        d = s;
        d = i;
        d = l;
        d = f;
        d = c;
        
        f = b;
        f = s;
        f = i;
        f = c;
        
        l = b;
        l = s;
        l = i;
        l = c;
        
        i = b;
        i = s;
        i = c;
        
        s = b;
        
        // c = b;
        // c = s;
        
        
        // Arrays
        // Para componentes do array vale a mesma regra de atribuição
        // Menor p/ Maior, Inteiro p/ Flutuante, e iguais OK.
        // O inverso só com cast.
        // Excecoes:    Nao pode atribuir nada exceto literal até 65535 para um char.
        //              Um short nao pode receber um char.

        byte[] ab = {b};
        short[] as = {b,s};
        int[] ai = {b,s,i,c};
        long[] al = {b,s,i,l,c};
        float[] af = {b,s,i,l,c,f};
        double[] ad = {b,s,i,l,c,f,d};
        char[] ac = {}; // char[] ac = {b}; // won't compile
        
        // Nao se pode atribuir um array de primitivos a outro

        // as = ab;
        
        // ai = ab;
        // ai = as;
        // ai = ac;
        
        // al = ab;
        // al = as;
        // al = ai;
        // al = ac;
        
        // af = ab;
        // af = as;
        // af = ai;
        // af = al;
        // af = ac;
        
        // ad = ab;
        // ad = as;
        // ad = ai;
        // ad = al;
        // ad = ac;
        // ad = af;
    }
}
