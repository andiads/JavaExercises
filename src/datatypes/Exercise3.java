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
public class Exercise3 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("masukan angka 1-1000: ");
        int num = input.nextInt();

        int first = num % 10;
        int remainingNumber = num / 10;
        int second = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int third = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int fourth = remainingNumber % 10;
        int sum = third + second + first + fourth;
        System.out.println("Jml semua nya dalam " + num + " adalah " + sum);

    }
}
