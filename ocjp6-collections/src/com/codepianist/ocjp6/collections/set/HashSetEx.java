/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist.ocjp6.collections.set;

import com.codepianist.ocjp6.collections.PersonWithoutHashCode;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * <h1>HashSetEx</h1> 
 * <p>created on: Aug 20, 2013, 8:57:40 AM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class HashSetEx {
    public static void main(String[] args) {
        Set set = new HashSet(Arrays.asList("Cavalo","Charrete","Carro","Caminhão",null));
        for(Object o : set){
            System.out.println(o);
        } 
        
        Set<PersonWithoutHashCode> set2 = new HashSet<PersonWithoutHashCode>(
                    Arrays.asList(new PersonWithoutHashCode("Zuleica"),
                        new PersonWithoutHashCode("Bete"),
                        new PersonWithoutHashCode("Amanda"))
                );
        for(PersonWithoutHashCode p : set2){
            System.out.println(p+": "+p.hashCode());
        } 
    }
}
