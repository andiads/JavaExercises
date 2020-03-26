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
public class Exercise6 {
    public static void main(String[]args){
        Calendar cal = Calendar.getInstance();
        System.out.println();
        System.out.println("Current full date and time is : " + (cal.get(Calendar.MONTH) + 1) + "-"
        + cal.get(Calendar.DATE) + "-" + cal.get(Calendar.YEAR) + " "
        + cal.get(Calendar.HOUR_OF_DAY) + ":" + cal.get(Calendar.MINUTE) + ":"
        + cal.get(Calendar.SECOND) + "." + cal.get(Calendar.MILLISECOND));
	System.out.println();
    }
}
