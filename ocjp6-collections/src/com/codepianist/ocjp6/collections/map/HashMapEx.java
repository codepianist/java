/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist.ocjp6.collections.map;

import com.codepianist.ocjp6.collections.PersonWithoutHashCode;
import java.util.HashMap;
import java.util.Map;

/**
 * <h1>HashMapEx</h1> 
 * <p>created on: Aug 20, 2013, 9:58:19 AM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class HashMapEx {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(new PersonWithoutHashCode("Zuleica"), "Carro");
        map.put(new PersonWithoutHashCode("Maria"), "Charrete");
        map.put(new PersonWithoutHashCode("Amanda"), "Cavalo");
        map.put(null, "Caminhão");
        
        for(Object o : map.keySet()){
            PersonWithoutHashCode p = (PersonWithoutHashCode)o;
            System.out.println(p+" tem um(a) "+map.get(o));
        }
    }
}
