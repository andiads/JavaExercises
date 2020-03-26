/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Arrays;

/**
 *
 * @author ANDI DWI SAPUTRO
 */
public class Exercise1 {
    public static void main (String[]args){
        int[]nums = {2020, 2012, 2055, 2031, 2009, 2001, 2042, 2008};
        String[]strs = {"java","php","phyton","ruby","scala","golang"};
        Arrays.sort(nums);
        Arrays.sort(strs);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(strs));
    }
}
