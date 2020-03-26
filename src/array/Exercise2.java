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
public class Exercise2 {
    public static void main(String[]args){
        int[]nums = {1,2,3,4,5};
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
        }
        System.out.println(Arrays.toString(nums));
        System.out.println("sum: "+sum);
    }
}
