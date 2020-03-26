/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic_exercises_1;

/**
 *
 * @author ANDI DWI SAPUTRO
 * Reverse the word
 */
public class Exercise61 {
    public static void main(String[]args){
        String str = "Andi";
        str = str.trim();
        String reversed = "";
        char[] ch = str.toCharArray();
        for (int i=ch.length-1;i>=0;i--){
            reversed += ch[i];
        }
        System.out.println("Original word: "+str);
        System.out.println("Reversed word: "+reversed);
    }
}
