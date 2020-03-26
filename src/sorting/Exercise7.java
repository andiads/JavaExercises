/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

/**
 *
 * @author ANDI DWI SAPUTRO
 */
public class Exercise7 {
    void sort(int arr[]){
        int n = arr.length;
        for (int i = 1; i<n; ++i){
            int key = arr[i];
            int j = i - 1;
            
            while (j >= 0 && arr[j]>key){
                arr[j+1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    
    static void printArray(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n; ++i){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    public static void main(String[]args){
        int arr[] = {22, 23,31, 41,29, 89, 75};
        Exercise7 is = new Exercise7();
        is.sort(arr);
        printArray(arr);
    }
}
