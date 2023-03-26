/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist.ocjp6.primitives;

import static com.codepianist.ocjp6.primitives.Primitives.c;
import static com.codepianist.ocjp6.primitives.Primitives.i;
import static com.codepianist.ocjp6.primitives.Primitives.s;

/**
 * <h1>AssigningLiterals</h1> 
 * <p>created on: Aug 13, 2013, 12:39:50 PM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class AssigningLiterals extends Primitives{
    public static void main(String[] args) {
        
        long _2_7 = (long) Math.pow(2, 7); System.out.printf("2ˆ7= %d.\n",_2_7);
        long _2_15 = (long) Math.pow(2, 15); System.out.printf("2ˆ15= %d.\n",_2_15);
        long _2_31 = (long) Math.pow(2, 31); System.out.printf("2ˆ31= %d.\n",_2_31);
        long _2_63 = (long) Math.pow(2, 63); System.out.printf("2ˆ63= %d.\n",_2_63);
        
        // Assigning AssigningLiterals
        b = 127;
        b = 120+7;
        // b = 128; // 2^7
        mb((byte)1);
        
        s = 32767;
        s = 32000 + 767;
        // s = 32768; 2^15
        ms((short)32767);
        
        c = 65535;
        c = 65000+535;
        // c = 65536; 2ˆ16
        mc((char)65535);
        
        i = 2147483647;
        // i = 2147483648; 2ˆ31
        mi(2147483647);
        
        f = 2147483647;
        // f = 2147483648; 2ˆ31
        
    }
    
    static void mb(byte b){ System.out.println("byte"); }
    static void ms(short s){ System.out.println("short"); }
    static void mi(int i){ System.out.println("int"); }
    static void ml(long l){ System.out.println("long"); }
    static void mc(char c){ System.out.println("char"); }
    static void mf(float f){ System.out.println("float"); }
    static void md(double d){ System.out.println("double"); }
    
    static void m(byte b){ System.out.println("byte"); }
    static void m(short s){ System.out.println("short"); }
    static void m(int i){ System.out.println("int"); }
    static void m(long l){ System.out.println("long"); }
    static void m(char c){ System.out.println("char"); }
    static void m(float f){ System.out.println("float"); }
    static void m(double d){ System.out.println("double"); }

}
