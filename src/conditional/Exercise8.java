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

public class Exercise8 {
    
  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Input alpabet: ");
        String input = in.next().toLowerCase();

        boolean uppercase = input.charAt(0) >= 65 && input.charAt(0) <= 90;
        boolean lowercase = input.charAt(0) >= 97 && input.charAt(0) <= 122;
        boolean vokals = input.equals("a") || input.equals("e") || input.equals("i")
                || input.equals("o") || input.equals("u");

        if (input.length() > 1)
        {
            System.out.println("Error. Unknown chars");
        }
        else if (!(uppercase || lowercase))
        {
            System.out.println("Error. Bukan sebuah huruf");
        }
        else if (vokals)
        {
            System.out.println("Merupakan huruf vokal");
        }
        else
        {
            System.out.println("Merupakan konsonan");
        }
    }
}

