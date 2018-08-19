/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist;

/**
 * <h1>Test01</h1> 
 * <p>created on: Jul 31, 2013, 3:23:22 PM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class Test01 {
    
    public static void main(String[] args) {
        CommonMonkey c = forType(CommonMonkey.class);
        BrazilianMonkey b = forType(BrazilianMonkey.class);
        
        testAnimal(c, "Macaco Comum");
        testAnimal(b, "Macaco Brasileiro");
        b.getDrunk();
                
        
    }
    public static void testAnimal(Animal a,String whichAnimal){
        System.out.printf("\nTesting animal %s:\n",whichAnimal);
        a.eat("Salada de alface");
        a.drink("Suquin de Cajú");
        a.breathe();
        
    }
    public static <T extends Animal> T forType(Class<T> type){
        if(type.getName().equals("com.codepianist.CommonMonkey"))
            return type.cast(new CommonMonkey());
        if(type.getName().equals("com.codepianist.BrazilianMonkey"))
            return type.cast(new BrazilianMonkey());
        return null;
    }

}
