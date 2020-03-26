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
public class Exercise6 {
    
    public static int findIndex(int[] arr, int t){
        if (arr==null) {
            return -1;
        }
        int index=0;
        while(index < arr.length){
            if (arr[index] == t){
                return index;
            } else {
                index = index + 1;
            }
        }
        return -1;
    }
    
    public static void main(String[]args){
        int[]nums = {1,22,33,14,75,69};
        System.out.println("index pos of 14 is: "+findIndex(nums, 14));
    }
    
}
