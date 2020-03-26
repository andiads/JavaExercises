/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datetime;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/**
 *
 * @author ANDI DWI SAPUTRO
 */
public class Exercise5 {
    public static void main(String[]args){
        Calendar cal = Calendar.getInstance(Locale.US);
        cal.setTimeZone(TimeZone.getTimeZone("America/New_York"));
        System.out.println(cal.get(Calendar.HOUR_OF_DAY)+":"+cal.get(Calendar.MINUTE));
    }
}
