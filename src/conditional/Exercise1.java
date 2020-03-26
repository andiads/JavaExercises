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
public class Exercise1 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int num = 0;
        
        num = in.nextInt();
        if (num<0){
            System.out.println("number is positive");
        } else {
            System.out.println("number is negative");
        }
            
        
        
    }
}
