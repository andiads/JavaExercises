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
public class Exercise12 {
    public static void main(String[]args){
        String s1="Java Exercises";
        String s2="Java Exercise";
        
        String endStr = "se";
        
        System.out.println("\""+s1+"ends with "+endStr+"\""+s1.endsWith(endStr));
        System.out.println("\""+s2+"ends with "+endStr+"\""+s2.endsWith(endStr));
    }
}
