/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist.ocjp6.garbagecollection.m_finalize;

import java.util.Date;

/**
 * <h1>TestGC2</h1> 
 * <p>created on: Aug 6, 2013, 6:57:13 PM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class TestGC2 {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        System.out.printf("Memória Total Antes: %d.\n",r.totalMemory());
        System.out.printf("Memória antes: %d.\n",r.freeMemory());
        
        for(int i= 0; i<50; i++){
            MyObj mo = new MyObj();
            mo= null;
        }
        System.out.printf("Memória depois de criar: %d.\n",r.freeMemory());
        System.gc();
        System.out.printf("Memória depois de limpar: %d.\n",r.freeMemory());
    }
    
}
