/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic_exercises_1;

/**
 *
 * @author ANDI DWI SAPUTRO
 * Java Basic: Exercise-38
 * > Count the letters, spaces, numbers and other characters of an input string
 * https://www.w3resource.com/java-exercises/basic/java-basic-exercise-38.php
 * 
 */
import java.util.Scanner;
public class Exercise38 {
    
 public static void main(String[] args) {
		String test = "Belajar java exercise38 --?? @2222 Enjoy!!!...";
		count(test);

	}
	public static void count(String x){
		char[] ch = x.toCharArray();
		int letter = 0;
		int space = 0;
		int num = 0;
            int other = 0;
            for (int i = 0; i < x.length(); i++) {
                if (Character.isLetter(ch[i])) {
                    letter++;
                } else if (Character.isDigit(ch[i])) {
                    num++;
                }
			else if(Character.isSpaceChar(ch[i])){
				space ++ ;
			}
			else{
				other ++;
			}
		}
		System.out.println("The string is : "+x);
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("other: " + other);
			}
}

/**
 * Flowchart / Alur logika exercise 38
 * 1. membuat method count(String x) dimana string x merupakan properties yang akan
 *      dihitung jumlah space, angka, maupun hurufnya.
 * 2. melocalize variable penampung jumlah spasi, angka, huruf dan lainnya.
 * 3. melocalize variable array char ch[] yg berisikan karakter2 pada String x dengan 
 *    menggunakan method toCharArray() pada string tsb
 * 4. melakukan looping untuk mendapatkan karakter2 yg di inginkan
 * 5. dengan kondisi dimana i sbg index acuan jika nilainya kurang dari panjang string x maka indeks i akan terus ditambah
 * 6. kemudian didalam looping tsb dibuat sbuah if else branch untuk mengambil masing2 nilai
 * 7. jika dibutuhkan nilai suatu char berjenis huruf/character maka variable letter akan ditambah 1 nilainya.
 * 8. begitu jg untuk spasi dan karakter simbol.
 * 9. membuat output string yg dimasukkan, jumlah huruf, angka, spasi, dan karakter simbol lainnya.
 * 10. pada main akan dipanggil static method count(StringValue) dgn suatu string sbg value nya yg mau dicari
 *     jumlah karakter, spasi, huruf, dan angka pada string tsb..
 */
