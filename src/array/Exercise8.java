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
public class Exercise8 {
    public static void main(String[]args){
        int[]nums = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int[]copyNums = new int[10];
        System.out.println("source: "+Arrays.toString(nums));
        for (int i =0; i<nums.length; i++){
            copyNums[i] = nums[i];
        }
        System.out.println("new: "+Arrays.toString(copyNums));
    }
}
