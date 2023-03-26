/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist.ocjp6.collections;

import java.util.Comparator;

/**
 * <h1>PersonWithComparator</h1> 
 * <p>created on: Aug 20, 2013, 11:05:59 AM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class PersonWithComparator {
    private String name;
    private int age;

    public PersonWithComparator(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public static Comparator<PersonWithComparator> COMPARE_BY_NAME = new Comparator<PersonWithComparator>() {
        @Override
        public int compare(PersonWithComparator p1, PersonWithComparator p2) {
            return p1.getName().compareTo(p2.getName());
        }
    };
    public static Comparator<PersonWithComparator> COMPARE_BY_AGE = new Comparator<PersonWithComparator>() {
        @Override
        public int compare(PersonWithComparator p1, PersonWithComparator p2) {
            return ((Integer)p1.getAge()).compareTo((Integer)p2.getAge());
        }
    };

    @Override
    public String toString() {
        return "PersonImplementsComparable{" + "name=" + name + ", age=" + age +'}';
    }
    
    
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
}
