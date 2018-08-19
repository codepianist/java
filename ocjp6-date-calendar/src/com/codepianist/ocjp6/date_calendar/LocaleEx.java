/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.codepianist.ocjp6.date_calendar;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * <h1>LocaleEx</h1> 
 * <p>created on: Aug 18, 2013, 6:59:46 PM.</p>
 *
 * @author César Barbosa <cesar@vesso.com.br>
 */
public class LocaleEx {
    public static void main(String[] args) {
        Date d = new Date();
        Locale france = new Locale("fr","FR");
        Locale brasil = new Locale("pt","BR");
        
        System.out.println("França: "+DateFormat.getDateInstance(DateFormat.FULL,france).format(d));
        System.out.println(france.getDisplayLanguage()+" - "+france.getDisplayLanguage(france));
        System.out.println(france.getDisplayCountry()+" - "+france.getDisplayCountry(france)+"\n");
        
        System.out.println("Brasil: "+DateFormat.getDateInstance(DateFormat.FULL,brasil).format(d));
        System.out.println(brasil.getDisplayLanguage()+" - "+brasil.getDisplayLanguage(brasil));
        System.out.println(brasil.getDisplayCountry()+" - "+brasil.getDisplayCountry(brasil));
    }
}
// run:
// França: dimanche 18 août 2013
// French - français
// France - France
//
// Brasil: Domingo, 18 de Agosto de 2013
// Portuguese - português
// Brazil - Brasil