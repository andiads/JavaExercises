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
public class Exercise5 {
    public static void main(String[]args){
        String str =  "The quick brown fox jumps over the lazy dog";
        System.out.println("num of words: "+getCountWords(str));
    }
    public static int getCountWords(String s){
        int count=0;

        if (!(" ".equals(s.substring(0,1)))||!(" ".equals(s.substring(s.length()-1)))){
            for (int i = 0; i < s.length();i++){
                if(s.charAt(i)==' '){
                    count++;
                }
            }
            count = count+1;
        }
        return count;
    }
}
