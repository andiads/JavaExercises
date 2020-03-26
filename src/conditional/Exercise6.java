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
public class Exercise6 {
    public static void main (String[]args){
        Scanner in = new Scanner(System.in);
        System.out.print("input float num: ");
        double x = in.nextDouble();
        System.out.print("input other float num:");
        double y = in.nextDouble();
        
        x = Math.round(x*1000);
        x/=1000;
        
        y = Math.round(y*1000);
        y/=1000;
        
        if (x==y){
            System.out.println("they're the same three decimal");
        } else {
            System.out.println("they're different");
        }
    }
}
