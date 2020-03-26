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
public class Exercise5 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("input number from 1-7:");
        int num;
        String weekday="";
        num = in.nextInt();
        switch(num){
            case 1:
                weekday = "senin";
                break;
            case 2:
                weekday = "selasa";
                break;
            case 3:
                weekday = "rabu";
                break;
            case 4:
                weekday = "kamis";
                break;
            case 5: 
                weekday = "jumat";
                break;
            case 6:
                weekday = "sabtu";
                break;
            case 7:
                weekday = "minggu";
                break;
            default:
                weekday = "unknown";
                break;
        }
        System.out.println(weekday);
    }
}
