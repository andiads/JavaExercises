/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic_exercises_1;

/**
 *
 * @author ANDI DWI SAPUTRO
 * Write a Java program to create a new string of 4 copies
 * of the last 3 characters of the original string.
 * The length of the original string must be 3 and above
 */
public class Exercise68 {
    public static void main(String[] args){
        String str = "Lorem ipsum dolor sit amet!";
        String lastThreeChars = str.substring(str.length()-3);
        for (int i=0;i<3;i++){
            System.out.print(lastThreeChars+"");
        }
    }
}
