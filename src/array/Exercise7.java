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
public class Exercise7 {
   static int[] removeIndex(int[] arr, int index){
       int []arr2 = arr;
       for (int i=index;i<arr.length-1;i++){
           arr2[i] = arr[i+1];
       }
       return arr2;
   }
    public static void main(String[]args){
        int[]nums = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int index = 1;
        System.out.println("bfr: "+Arrays.toString(nums));
        System.out.println("after: "+Arrays.toString(removeIndex(nums, index)));
    }
}
