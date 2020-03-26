/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datatypes;

import java.util.Scanner;
/**
 *
 * @author ANDI DWI SAPUTRO
 */

public class Exercise5 {

    public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input the time zone offset to GMT: ");
        long timeZoneChange = input.nextInt();

        long totMs = System.currentTimeMillis();

        long totDetik = totMs / 1000;

        long curDetik = totDetik % 60;

        long totMenit = totDetik / 60;

        long curMenit = totMenit % 60;

        long totJam = totMenit / 60;

        long curJam = ((totJam + timeZoneChange) % 24);

        System.out.println("Waktu saat ini: " + curJam + ":" + curMenit + ":" + curDetik);
    }
}
