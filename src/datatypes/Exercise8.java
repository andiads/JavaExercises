/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datatypes;

/**
 *
 * @author ANDI DWI SAPUTRO
 */
public class Exercise8 {
    public static void main(String[]args){
        double nilai = 15;
        System.out.printf("Square: %12.2f\n", nilai*nilai);
        System.out.printf("Cube: %14.2f\n", nilai*nilai*nilai);
        System.out.printf("Fourth power: %6.2f\n", Math.pow(nilai, 4));
    }
}
