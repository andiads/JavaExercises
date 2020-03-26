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
public class Exercise9 {
    public static void main(String[]args){
        List<String> colorList = new ArrayList<String>();
        colorList.add("Red");
        colorList.add("Green");
        colorList.add("Blue");
        System.out.println(colorList);
        List<String> copy = new ArrayList<String>();
        copy.add("A");
        copy.add("B");
        copy.add("C");
        System.out.println(copy);
        Collections.copy(colorList, copy);
        System.out.println(colorList);
        System.out.println(copy);
        
    }
}
