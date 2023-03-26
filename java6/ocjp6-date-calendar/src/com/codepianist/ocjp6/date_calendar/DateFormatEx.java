/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist.ocjp6.date_calendar;

import java.text.DateFormat;
import java.util.Date;

/**
 * <h1>DateFormatEx</h1> 
 * <p>created on: Aug 18, 2013, 6:33:22 PM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class DateFormatEx {
    public static void main(String[] args) {
        Date d = new Date();
        String s = DateFormat.getDateInstance(DateFormat.FULL).format(d); // 
        System.out.println( s );
        
        
        Date d2 = null;
        try {
            d2 = DateFormat.getDateInstance(DateFormat.FULL).parse(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println( d2 );
    }
}
// run:
// Sunday, August 18, 2013
// Sun Aug 18 00:00:00 BRT 2013
