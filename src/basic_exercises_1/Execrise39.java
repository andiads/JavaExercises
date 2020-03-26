/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic_exercises_1;

/**
 *
 * @author ANDI DWI SAPUTRO
 * Java Basic: Exercise-39
 * Create and display unique three-digit number using 1, 2, 3, 4. 
 * Also count how many three-digit numbers are there
 * https://www.w3resource.com/java-exercises/basic/java-basic-exercise-39.php
 *  
 */
public class Execrise39 {
   public static void main(String[]args){
       int jumlah=0;
       // used number: 1234 = 4 element
       for (int i=1;i<=4;i++){
           for (int j=1;j<=4;j++){
               for (int k=1;k<=4;k++) {
                   if ((i!=j)&&(j!=k)&&(i!=k)){
                       jumlah++;
                       System.out.println(i+""+j+""+k);
                   }
               }
           }
       }
       System.out.println("Jumlah digit unik: "+jumlah);
   } 
}

/**
 * Flowchart
 * 1. initaite nilai jumlah = 0
 * 2. lakukan nested looping utk index i, j, k dengan masing2 nilai
 *    awalnya = 1. 
 * 3. apabila masing2 indeks nilainya kurang dari sama dengan 4 ketika looping
 * 4. maka nilai indeks masing2 akan ditambah 1 (post increment)
 * 5. pada nested loop terakhir lakukan kondisi pengecekan dgn if else branch
 * 6. jika masing2 indeks tidak sama satu sama lain maka nilai jumlah digit unik akan ditambah
 *    dan digit unik akan ditampilkan dgn meng-append nilai i j dan k 
 * 7. diluar nested loop println menampilkan jumlah digit unik yg dihasilkan dari angka 1,2,3,4
 */