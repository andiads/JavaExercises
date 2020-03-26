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
public class Exercise2 {
    void bubbleSort(int arr[]){
        int n = arr.length;
        for (int i=0;i<n-1;i++){
            for (int j=0;j<n-i-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    
    void printArray(int arr[]){
        int n = arr.length;
        for (int i=0;i<n;++i){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    public static void main(String[]args){
        Exercise2 bs = new Exercise2();
        int arr[] = {2,3,4,11,24,7,8,91};
        bs.bubbleSort(arr);
        System.out.println("sorted array");
        bs.printArray(arr);
    }
}
