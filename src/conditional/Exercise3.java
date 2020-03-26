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
public class Exercise3 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

        int firstNumber;
        int secondNumber;
        int thirdNumber;
        int greatest=0;
        
        firstNumber = in.nextInt();
        secondNumber = in.nextInt();
        thirdNumber = in.nextInt();
        
        if (firstNumber > secondNumber && firstNumber > thirdNumber){
            greatest = firstNumber;
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber){
            greatest = secondNumber;
        } else if (thirdNumber > firstNumber && thirdNumber > secondNumber){
            greatest = thirdNumber;
        }
        System.out.println("The greatest: "+greatest);
    }
}
