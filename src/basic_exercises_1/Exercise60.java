/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic_exercises_1;

/**
 *
 * @author ANDI DWI SAPUTRO
 * Write a Java program to find 
 * the penultimate (next to last) word of a sentence.
 */
public class Exercise60 {
    public static void main(String[]args){
        String str = "The quick brown fox jumps over the lazy dog.";
        String[]words = str.split(" ");
        System.out.println("penultimate word: "+words[words.length-2]);
    }
}
