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
public class Exercise6 {

    void sort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
                int temp = arr[min_idx];
                arr[min_idx] = arr[i];
                arr[i] = temp;
            }
        }
    }

    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
            System.out.println();
        }
    }

    public static void main(String[] ars) {
        Exercise6 ss = new Exercise6();
        int arr[] = {65, 61, 25, 12, 22, 31, 9};
        ss.sort(arr);
        System.out.println("Sorted arr");
        ss.printArray(arr);
    }

}
