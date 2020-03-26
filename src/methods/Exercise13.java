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
public class Exercise13 {
    public static void main(String[]args){
        double sisiA = 10;
        double sisiB = 15;
        double sisiC = 20;
        System.out.println(getTriangleArea(sisiA, sisiB,sisiC));
    }
    
    public static double getTriangleArea(double a, double b, double c){
        double area=0;
        double s = (a+b+c)/2;
        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return area;
    }
}
