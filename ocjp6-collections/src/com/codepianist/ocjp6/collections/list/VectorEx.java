/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist.ocjp6.collections.list;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

/**
 * <h1>VectorEx</h1> 
 * <p>created on: Aug 20, 2013, 9:19:53 AM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class VectorEx {
    public static void main(String[] args) {
        List list = new Vector(Arrays.asList("Cavalo","Charrete","Carro","Caminhão",null));
        for(Object o : list){
            System.out.println(o);
        }
    }
}
