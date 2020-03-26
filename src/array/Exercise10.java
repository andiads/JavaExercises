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
public class Exercise10 {
    static int max;
    static int min;
    static void findMinMax(int arr[]){
        max = arr[0];
        min = arr[0];
        int len = arr.length;
        for (int i = 1; i < len - 1; i = i + 2) {
            if (i + 1 > len) {
                if (arr[i] > max) max = arr[i];
                if (arr[i] < min) min = arr[i];
            }
            if (arr[i] > arr[i + 1]) {
                if (arr[i] > max) max = arr[i];
                if (arr[i + 1] < min) min = arr[i + 1];
            }
            if (arr[i] < arr[i + 1]) {
                if (arr[i] < min) min = arr[i];
                if (arr[i + 1] > max) max = arr[i + 1];
            }
        }
    }
    public static void main(String[]args){
        int[]nums = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        findMinMax(nums);
        System.out.println("max: "+max);
        System.out.println("min: "+min);
        
    }
}
