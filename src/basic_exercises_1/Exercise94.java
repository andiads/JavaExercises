/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic_exercises_1;

import java.util.Arrays;

/**
 *
 * @author ANDI DWI SAPUTRO
 * Rearrange all the elements of an given array of integers 
 * so that all the odd numbers come before all the even numbers
 */
public class Exercise94 {

    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 5, 6, 10, 12, 15, 21, 32};
        int index= 0;
        int[] rearranged = new int[nums.length];

        System.out.println("given array: " + Arrays.toString(nums));
        
        
        for (int i=0;i<nums.length;i++){
            if((nums[i]%2!=0) && (nums[i]>1)){
                rearranged[index++]=nums[i];
            }
        }
        
        for (int j=0;j<nums.length;j++) {
            if ((nums[j]%2==0) || (nums[j]==1)){
                rearranged[index++]=nums[j];
            }
        }
        System.out.println("rearranged array: " + Arrays.toString(rearranged));
    }
}
