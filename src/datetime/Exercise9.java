/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.time.*;

/**
 *
 * @author ANDI DWI SAPUTRO
 */
public class Exercise9 {

    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();

        cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

        System.out.println();

        DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
        System.out.println(df.format(cal.getTime()));
        for (int i = 0; i < 6; i++) {
            cal.add(Calendar.DATE, 1);
        }
        System.out.println(df.format(cal.getTime()));
        System.out.println();
    }
}
