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
public class Exercise1 {
    public static void main(String[]args){
        double first = 25;
        double second = 37;
        double third = 29;
        
        System.out.println("smallest namer is: "+findSmallestNum(first,second,third));
    }
    
    public static double findSmallestNum(double x, double y, double z){
        return Math.min(Math.min(x, y), z);
    }
}
