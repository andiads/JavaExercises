/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditional;

import java.util.Scanner;

/**
 *
 * @author ANDI DWI SAPUTRO
 */
public class Exercise7 {

    
  public static void main(String[] strings) {

        Scanner input = new Scanner(System.in);

        int numHariDalamBulan = 0; 
        String namaBulan = "Unknown";

        System.out.print("Input no bulan: ");
        int month = input.nextInt();

        System.out.print("Input tahun: ");
        int tahun = input.nextInt();

        switch (month) {
            case 1:
                namaBulan = "Januari";
                numHariDalamBulan = 31;
                break;
            case 2:
                namaBulan = "Februari";
                if ((tahun % 400 == 0) || ((tahun % 4 == 0) && (tahun % 100 != 0))) {
                    numHariDalamBulan = 29;
                } else {
                    numHariDalamBulan = 28;
                }
                break;
            case 3:
                namaBulan = "Maret";
                numHariDalamBulan = 31;
                break;
            case 4:
                namaBulan = "April";
                numHariDalamBulan = 30;
                break;
            case 5:
                namaBulan = "Mei";
                numHariDalamBulan = 31;
                break;
            case 6:
                namaBulan = "Juni";
                numHariDalamBulan = 30;
                break;
            case 7:
                namaBulan = "Juli";
                numHariDalamBulan = 31;
                break;
            case 8:
                namaBulan = "Agustus";
                numHariDalamBulan = 31;
                break;
            case 9:
                namaBulan = "September";
                numHariDalamBulan = 30;
                break;
            case 10:
                namaBulan = "Oktober";
                numHariDalamBulan = 31;
                break;
            case 11:
                namaBulan = "November";
                numHariDalamBulan = 30;
                break;
            case 12:
                namaBulan = "Desember";
                numHariDalamBulan = 31;
        }
        System.out.print(namaBulan + " " + tahun + " memiliki " + numHariDalamBulan + " hari\n");
    }
}

