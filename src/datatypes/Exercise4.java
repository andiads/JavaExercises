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
public class Exercise4 {
    public static void main(String[] args){
        double minutesInYear = 365 * 24 * 60;
        
        Scanner in = new Scanner(System.in);
        System.out.print("input nomor menit: ");
        double min = in.nextDouble();
        long tahun = (long) (min/minutesInYear);
        int hari = (int) (min/60/24)%365;
        System.out.println((int) min + " menit setara dengan "+tahun+" tahun dan "+hari+" hari");
    }
}
