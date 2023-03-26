/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist.ocjp6.date_calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * <h1>CalendarEx</h1> 
 * <p>created on: Aug 18, 2013, 6:08:22 PM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class CalendarEx {
    public static void main(String[] args) {
        Calendar calSet = Calendar.getInstance();
        calSet.set(Calendar.DAY_OF_MONTH,50);
        calSet.set(Calendar.YEAR,1976);
        
    }

    private static void prt_cal(Calendar calSet) {
        System.out.println(calSet.get(Calendar.YEAR)+"/"+(calSet.get(Calendar.MONTH)+1)+"/"+calSet.get(Calendar.DAY_OF_MONTH));
    }
}
