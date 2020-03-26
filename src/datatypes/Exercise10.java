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
public class Exercise10 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan 6 digit angka: ");
        String num = in.nextLine();
        
        for (int i=0; i < 6; i++){
            System.out.print(num.charAt(i)+" ");
        }
    }
}
