/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist.ocjp6.collections;

/**
 * <h1>PersonNotImplementsComparable</h1> 
 * <p>created on: Aug 20, 2013, 10:45:50 AM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class PersonNotImplementsComparable {
    private String name;

    public PersonNotImplementsComparable(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PersonImplementsComparable{" + "name=" + name + '}';
    }
    
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
