/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

/**
 *
 * @author ANDI DWI SAPUTRO
 */
public class Exercise10 {
    public static void main(String[]arg){
        int yr = 2017;
        System.out.println(isLeapYear(yr));
    }
    public static boolean isLeapYear(int y){
        boolean a = (y%4)==0;
        boolean b = (y%100)!=0;
        boolean c = ((y%100==0) && (y%400==0));
        boolean res =a && (b||c);
        return res;
    }
}
