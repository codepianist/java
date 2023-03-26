/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist.ocjp6.collections.set;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * <h1>LinkedHashSetEx</h1> 
 * <p>created on: Aug 20, 2013, 9:02:06 AM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class LinkedHashSetEx {
    public static void main(String[] args) {
        Set set = new LinkedHashSet(Arrays.asList("Cavalo","Charrete","Carro","Caminhão",null));
        for(Object o : set){
            System.out.println(o);
        }
    }
}
