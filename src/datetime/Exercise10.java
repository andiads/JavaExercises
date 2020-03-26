/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datetime;

import java.util.*;
import java.time.*;
import java.text.*;

/**
 *
 * @author ANDI DWI SAPUTRO
 */
public class Exercise10 {

    public static void main(String[] args) {
        YearMonth ym = YearMonth.of(2020, 3);

        String firstDay = ym.atDay(1).getDayOfWeek().name();
        String lastDay = ym.atEndOfMonth().getDayOfWeek().name();
        System.out.println();
        System.out.println(firstDay);
        System.out.println(lastDay);
        System.out.println();
    }
}
