/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist.ocjp6.date_calendar;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * <h1>NumberFormatEx</h1> 
 * <p>created on: Aug 18, 2013, 10:34:15 PM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class NumberFormatEx {
    public static void main(String[] args) {
        double d = 102548899.7884;
        NumberFormat nf = NumberFormat.getInstance(new Locale("pt","BR"));
        System.out.println("102548899.7884: "+nf.format(d));
        nf.setMaximumFractionDigits(2);
        System.out.println("102548899.7884: "+nf.format(d));
        System.out.println("102548899.7884: "+NumberFormat.getCurrencyInstance(new Locale("pt","BR")).format(d));
    }
}
