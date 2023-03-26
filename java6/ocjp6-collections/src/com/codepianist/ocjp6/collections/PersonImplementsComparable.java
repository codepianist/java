/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist.ocjp6.collections;

/**
 * <h1>PersonImplementsComparable</h1> 
 * <p>created on: Aug 20, 2013, 10:14:44 AM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class PersonImplementsComparable implements Comparable<PersonImplementsComparable>{
    private String name;

    public PersonImplementsComparable(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PersonImplementsComparable{" + "name=" + name + '}';
    }
    
    @Override
    public int compareTo(PersonImplementsComparable o) {
        if(o!=null) return getName().compareTo(o.getName());
        else return 1;
    }
    
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
