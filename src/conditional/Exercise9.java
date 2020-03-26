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
public class Exercise9 {

    
  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Input the year: ");
        int year = in.nextInt();

        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = ((year % 100 == 0) && (year % 400 == 0));

        if (x && (y || z))
        {
            System.out.println(year + " kabisat");
        }
        else
        {
            System.out.println(year + " bukan kabisat");
        }
    }
}

