/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist.ocjp6.collections.list;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * <h1>LinkedListEx</h1> 
 * <p>created on: Aug 20, 2013, 9:19:12 AM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class LinkedListEx {
    public static void main(String[] args) {
        List list = new LinkedList(Arrays.asList("Cavalo","Charrete","Carro","Caminhão",null));
        for(Object o : list){
            System.out.println(o);
        }
    }
}
