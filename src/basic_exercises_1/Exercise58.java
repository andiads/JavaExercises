/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic_exercises_1;

/**
 *
 * @author ANDI DWI SAPUTRO Write a Java program to capitalize the first letter
 * of each word in a sentence
 */
public class Exercise58 {

    public static void main(String[] args) {
        String str = "the quick brown fox jumps over the lazy dog.";
        String[] words = str.split(" ");
        
        for (int i = 0; i < words.length; i++) {
            System.out.print(Character.toUpperCase(words[i].charAt(0))
                    + words[i].substring(1) +" ");
        }

    }
}

/**
 * Alur logikanya adalah string utama harus dipecah/split untuk mendapatkan kata
 * yg ada pada string tsb dan di store kedalam array words
 * selanjutnya melakukan looping berdasarkan panjang string tsb.
 * apabila index i kurang dr panjang string maka i di increment.
 * selanjutnya menampilkan karakter yg di uppercase dengan mengambil kata2 pada array words
 * yg selanjutnya di pointing posisi karakter mana yg mau diubah menjadi uppercase pada kata tsb
 * yakni pada posisi pertama atau index 0 pada kata tsb. 
 * Selanjutnya append dengan kata selanjutnya dengan melakukan substring 
 * atau penghapusan karakter pada posisi pertama kata tersebut yg sblm di uppercase
 * ex: string kata ori: the > uppercase huruf T > hasil menjadi The dan substring(1) digunakan
 * agar hasilnya tidak menjadi Tthe apabila substring(0) atau tdk menghapus huruf di posisi tsb.
 * 
 */
