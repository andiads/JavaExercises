/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datetime;

import java.util.*;
import java.util.Calendar;

/**
 *
 * @author ANDI DWI SAPUTRO
 */
public class Exercise1 {

    public static void main(String[] args) {
        int tahun = 2020;
        int bulan = 3;
        int tgl = 26;

        Calendar cal = Calendar.getInstance();
        System.out.println();
        cal.clear();
        cal.set(Calendar.YEAR, tahun);
        cal.set(Calendar.MONTH, bulan);
        cal.set(Calendar.DATE, tgl);
        System.out.println(cal.getTime());
    }

}
