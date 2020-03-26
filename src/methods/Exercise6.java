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
public class Exercise6 {
    public static void main(String[]args){
        int digit = 25;
        System.out.println("the sum is "+sumDigits(digit));
    }
    
    public static int sumDigits(long n){
        int result = 0;
        
        while (n>0){
            result+=n%10;
            n/=10;
        }
        return result;
    }
}
