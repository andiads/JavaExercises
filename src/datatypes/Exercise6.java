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
public class Exercise6 {

    public static void main(String[] Strings) {

        // BMI formula: kg/m
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan berat badan(kg): ");
        double weight = input.nextDouble();

        System.out.print("Masukkan tinggi badan(m): ");
        double height = input.nextDouble();

        double BMI = weight / (height*height);
        System.out.print("Body Mass Index is " + BMI+"\n");
    }
}
