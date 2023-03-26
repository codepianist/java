/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codepianist.ocjp6.date_calendar;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author cbs_sp
 */
public class DateEx {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);
        d.setTime(d.getTime()+(1000*60*60));
        System.out.println(d);
    }
}
// run:
// Sun Aug 18 17:27:03 BRT 2013
// Sun Aug 18 18:27:03 BRT 2013