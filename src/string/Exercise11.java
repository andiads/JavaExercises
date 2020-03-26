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
public class Exercise11 {
    public static void main(String[]args){
        char[]num=new char[]{'1','2','3','4'};
        
        String str = String.copyValueOf(num,1,3);
        System.out.println("The book contains "+str+" pages");
    }
}
