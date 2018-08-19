/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist.ocjp6.arrays;

/**
 * <h1>ComparingWrappersArrays</h1> 
 * <p>created on: Aug 14, 2013, 11:49:22 AM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class ComparingWrappersArrays extends ComparingPrimitivesArrays{
    
    static Byte[] aB = new Byte[]{1};
    static Short[] aS = new Short[]{1};
    static Integer[] aI = new Integer[]{1};
    static Long[] aL = new Long[]{1l};
    static Float[] aF = new Float[]{1f};
    static Double[] aD = new Double[]{1.0};
    static Character[] aC = new Character[]{1};
        
    public static void maIn(String[] args) {

        // if(aB == aS) System.out.println("ops!"); // incomparable types
        // if(aB == aI) System.out.println("ops!"); // incomparable types
        // if(aB == aL) System.out.println("ops!"); // incomparable types
        // if(aB == aF) System.out.println("ops!"); // incomparable types
        // if(aB == aD) System.out.println("ops!"); // incomparable types
        // if(aB == aC) System.out.println("ops!"); // incomparable types
        
        // if(aS == aI) System.out.println("ops!"); // incomparable types
        // if(aS == aL) System.out.println("ops!"); // incomparable types
        // if(aS == aF) System.out.println("ops!"); // incomparable types
        // if(aS == aD) System.out.println("ops!"); // incomparable types
        // if(aS == aC) System.out.println("ops!"); // incomparable types
        
        // if(aI == aL) System.out.println("ops!"); // incomparable types
        // if(aI == aF) System.out.println("ops!"); // incomparable types
        // if(aI == aD) System.out.println("ops!"); // incomparable types
        // if(aI == aC) System.out.println("ops!"); // incomparable types
        
        // if(aL == aF) System.out.println("ops!"); // incomparable types
        // if(aL == aD) System.out.println("ops!"); // incomparable types
        // if(aL == aC) System.out.println("ops!"); // incomparable types
        
        // if(aF == aD) System.out.println("ops!"); // incomparable types
        // if(aF == aC) System.out.println("ops!"); // incomparable types
        
        // if(aL == aC) System.out.println("ops!"); // incomparable types
    }
}
