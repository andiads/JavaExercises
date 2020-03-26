/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author ANDI DWI SAPUTRO
 */
public class Exercise5 {

    public static void main(String[] args) {
        int[] nums = {22, 31, 24, 11, 22, 55, 89, 100, 100, 321};
        int val = 22;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==val){
                System.out.println("it countains "+val);
            } else {
                System.out.println("it didn't contains "+val);
            }
        }
    }
}
