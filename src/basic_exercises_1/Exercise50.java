/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic_exercises_1;

/**
 *
 * @author ANDI DWI SAPUTRO
 */
public class Exercise50 {

    public static void main(String[] args) {
        System.out.println("\nDivided by 3: ");
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + ", ");
            }
        }

        System.out.println("\n\nDivided by 5: ");
        for (int i = 1; i < 100; i++) {
            if (i % 5 == 0) {
                System.out.print(i + ", ");
            }
        }

        System.out.println("\n\nDivided by 3 & 5: ");
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.println("\n");
    }
}

/**
 * Intinya jika deretan angka 1-100 tersebut saat dilooping
 * dan dibagi dengan masing2 pembagi (3,5) sisa baginya sama dengan 0
 * atau habis dibagi 3 maupun lima maka tampilkan nilai indeks i dari 1-100 tsb
 * 
 */
