/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist.ocjp6.constructors.cannot_ref_instance_field_as_args_to_super_or_this;

/**
 * <h1>Child</h1> 
 * <p>created on: Aug 4, 2013, 11:11:07 PM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class Child extends Father{
    public Child() {
        //this(childValue); // illegal
        this("legal");
    }
    public Child(String value) {
        // super(childValue); // illegal
        super(value);
    }
    private String childValue;
}
