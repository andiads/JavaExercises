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
public class Exercise4 {
    public static void main(String[]args){
        int[]nums = {1,2,3,4,5};
        double avg=0;int sum=0;
        for (int i = 0;i<nums.length;i++){
            
            sum += nums[i];
            avg = (double)(sum/(nums.length-1));
        }
        System.out.println(Arrays.toString(nums));
        System.out.println("Averages: "+avg);
    }
}
