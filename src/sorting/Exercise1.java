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
public class Exercise1 {
    int partition(int arr[], int low, int high){
        int pivot = arr[high];
        int i = (low-1);
        for (int j=low; j<high;j++){
            if (arr[j]<pivot){
                i++;
                
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        
        return i+1;
    }
    
    void sort(int arr[], int low, int high){
        if (low<high){
            int pts = partition(arr, low, high);
            sort(arr,low,pts-1);
            sort(arr, pts+1, high);
        }
    }
    
    static void printArray(int arr[]){
        int n = arr.length;
        for (int i =0;i<n;++i){
            System.out.print(arr[i]+" ");
            
        }
        System.out.println();
    }
    
    public static void main(String[]args){
        int arr[]={10,3,6,7,8,9,5,1};
        int n = arr.length;
        Exercise1 qs = new Exercise1();
        qs.sort(arr, 0, n-1);
        System.out.println("sorted array");
        printArray(arr);
    }
}
