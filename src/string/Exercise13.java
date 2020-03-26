/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string;

/**
 *
 * @author ANDI DWI SAPUTRO
 */
public class Exercise13 {
    public static void main(String[]args){
        String s1 = "Stephen Edwin King";
        String s2 = "Walter Winchell";
        String s3 = "stephen edwin king";
        
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.equalsIgnoreCase(s3));
    }
}
