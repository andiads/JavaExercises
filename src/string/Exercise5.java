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
public class Exercise5 {
    public static void main(String[] args){
        String s1 = "This is Exercise 1";
        String s2 = "This is Exercise 2";
        
        System.out.println("str1 : "+s1);
        System.out.println("str2 : "+s2);
        
        int res = s1.compareTo(s2);
        
        if (res < 0) {
            System.out.println("\""+s1+"\""+" < "+"\""+s2+"\"");
        } else if (res == 0) {
            System.out.println("\""+s1+"\""+" = "+"\""+s2+"\"");
        } else {
            System.out.println("\""+s1+"\""+" > "+"\""+s2+"\"");
        }
    }
}
