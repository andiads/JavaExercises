/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author ANDI DWI SAPUTRO
 */
public class Exercise8 {
    public static void main(String[]args){
        List<String> colorList = new ArrayList<String>();
        colorList.add("Red");
        colorList.add("Green");
        colorList.add("Blue");
        System.out.println(colorList);
        Collections.sort(colorList);
        System.out.println(colorList);
    }
}
