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
public class Exercise3 {
    public static void main(String[]args){
        int[][]dashes = new int[10][10];
        for (int i = 0;i<10;i++){
            for(int j = 0;j<10;j++){
                System.out.printf("- ",dashes[i][j]);
            }
            System.out.println();
        }
    }
}
