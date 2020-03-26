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
public class Exercise2 {
    public static void main(String[]args){
        double first=25;
        double second=45;
        double third=65;
        System.out.println("avg: "+getAverage(first,second,third));
    }
    
    public static double getAverage(double x, double y, double z){
        return (( x + y + z)/3);
    }
}
