/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

/**
 *
 * @author ANDI DWI SAPUTRO
 */
public class Exercise4 {
    public static void main(String[]args){
        String str = "w3resource";
        System.out.println("num of vowels: "+getCountVowels(str));
    }
    public static int getCountVowels(String s){
        int count = 0;
        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i'
                    || s.charAt(i) == 'o' || s.charAt(i) == 'u')
            {
                count++;
            }
        }
        return count;
    }
}
