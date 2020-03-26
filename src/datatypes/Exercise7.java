/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datatypes;

/**
 *
 * @author ANDI DWI SAPUTRO
 */
public class Exercise7 {
    public static void main(String[]args){
        float t;
        float mps, kph, mph;
        float jarak = 2500;
        float menit = 56;
        float jam = 5;
        float detik = 23;
        
        t = (jam*3600)+(menit*60)+detik;
        mps = jarak/t;
        kph = (jarak/1000.0f)/(t/3600.0f);
        mph = kph / 1.609f;
        
        System.out.println("Kecepatan m/s: "+mps);
        System.out.println("Kecepatan km/h: "+kph);
        System.out.println("Kecepatan mil/h: "+mph);
    }
}
