/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist.ocjp6.garbagecollection.m_finalize;

/**
 * <h1>MyObj</h1> 
 * <p>created on: Aug 6, 2013, 6:59:13 PM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
class MyObj{

    static int instances;
    public MyObj() {
        instances++;
        myNumber = instances;
        System.out.printf("Borning # %d...",myNumber);
    }

    int myNumber;
    public int getMyNumber() {
        return myNumber;
    }
    
    @Override
    protected void finalize() throws Throwable {
        System.out.printf("# %d saying bye: Oh! Goodbye Cruel World...\n",myNumber);
    }

}
