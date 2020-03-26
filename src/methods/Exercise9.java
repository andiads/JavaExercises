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
public class Exercise9 {
    public static void main(String[]args){
        printChars('(','z',20);
    }
    
    public static void printChars(char ch1, char ch2, int n){
        for (int cx = 1; ch1 <= ch2; cx++,ch1++){
            System.out.print(ch1+" ");
            if (cx % n == 0) {
                System.out.println("");
            }
        }
        System.out.print("\n");
    }
}
