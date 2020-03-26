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
public class Exercise8 {

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
        System.out.println(cal.getTime());
        System.out.println();
    }
}
