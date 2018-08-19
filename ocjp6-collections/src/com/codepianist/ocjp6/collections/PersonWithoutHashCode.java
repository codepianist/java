/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist.ocjp6.collections;

/**
 * <h1>PersonWithoutHashCode</h1> 
 * <p>created on: Aug 20, 2013, 9:45:09 AM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class PersonWithoutHashCode {
    private String name;

    public PersonWithoutHashCode(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PersonWithoutHashCode{" + "name=" + name + '}';
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
}
