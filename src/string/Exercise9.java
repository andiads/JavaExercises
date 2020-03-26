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
public class Exercise9 {
    public static void main(String[]args) {
        String s1="example.com", s2="Example.com";
        CharSequence cs = "example.com";
        System.out.println("comparing "+s1+" and "+cs+": "+s1.contentEquals(cs));
        System.out.println("comparing "+s2+" and "+cs+": "+s2.contentEquals(cs));
    }
}
