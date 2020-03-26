/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic_exercises_1;

/**
 *
 * @author ANDI DWI SAPUTRO
 * Write a Java program to take the last three characters 
 * from a given string and add the three characters
 * at both the front and back of the string. 
 * String length must be greater than three and more.
 */
public class Exercise84 {
    public static void main(String[]args){
        String str = "Spring";
        String str2 = str.substring(str.length()-3);
        String newString = str2.concat(str).concat(str2);
        System.out.println("String ori: "+str);
        System.out.println("Output: "+newString);
    }
}
