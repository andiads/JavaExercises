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
public class Exercise3 {
    public static void main(String[]args){
        String str = "350";
        System.out.println("The middle char is: "+getMidChar(str));
    }
    public static String getMidChar(String s){
        int pos;
        int length;
        if (s.length()%2==0){
            pos = s.length()/2-1;
            length = 2;
        } else {
            pos = s.length()/2;
            length = 1;
        }
        
        return s.substring(pos, pos+length);
    }
}
