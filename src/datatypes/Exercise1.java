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

public class Exercise1 {
    public static void main(String[]args){
        double f = 212;
        double c = 0;
        // formula (212°F − 32) × 5/9
        c = ((5*(f-32.0))/9.0);
        System.out.println(f + " derajat fahrenheit = " + c +" celcius.");
    }
}
