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
public class Exercise9 {

    public static void main(String[] args) {
        int[] nums = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int indexPos = 2;
        int newVal = 5;

        System.out.println("bfr: " + Arrays.toString(nums));
        for (int i = nums.length - 1; i > indexPos; i--) {
            nums[i] = nums[i - 1];
        }
        nums[indexPos] = newVal;
        System.out.println("new: "+Arrays.toString(nums));
    }
}
