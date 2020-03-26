/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datetime;

import java.util.Calendar;

/**
 *
 * @author ANDI DWI SAPUTRO
 */
public class Exercise3 {

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getActualMaximum(Calendar.YEAR));
        System.out.println(cal.getActualMaximum(Calendar.MONTH));
        System.out.println(cal.getActualMaximum(Calendar.WEEK_OF_YEAR));
        System.out.println(cal.getActualMaximum(Calendar.DATE));

        
    }
}
