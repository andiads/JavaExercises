/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic_exercises_1;

import java.util.Scanner;
/**
 *
 * @author ANDI DWI SAPUTRO
 *  Java Basic: Exercise-37
 *  > Reverse String
 *  https://www.w3resource.com/java-exercises/basic/java-basic-exercise-37.php
 * 
 */
public class Exercise37 {
    public static void main(String[] args){
        String str = "The quick brown fox";
        char[]letters = str.toCharArray();
        System.out.println("Original string: "+str);
        System.out.print("reversed string: ");
        for (int i = letters.length - 1; i >= 0; i--){
            System.out.print(letters[i]);
        }
        System.out.print("\n");
    }
    
    /**
     *  Flowchart/alur logika program
     *  1. initiate string original yg mau di reverse
     *  2. ambil tiap2 chars pada string tsb dengan menggunakan method toCharArray()
     *  3. array chars tsb di assign ke char array letters[]
     *  4. melakukan looping dimana nilai i yg akan diambil sebagai output di 
     *      initiate nilainya sama dengan jumlah array letters dikurangi 1 index
     *  5. kemudian kondisi pengulangan for jika kondisi i saat looping lebih besar atau sama dengan 0
     *      maka nilai index i dikurangi 1
     *  6. kemudan menampilkan output dengan mengambil nilai dari indeks i pada array letters.
     *  7. menggunakan print bukan println supaya hasil keluaran chars tsb bisa terappend scr horizontal bukan membuat line baru.
    */
}
