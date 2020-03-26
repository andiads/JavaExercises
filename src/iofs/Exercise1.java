/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iofs;

import java.io.File;
import java.util.Date;

/**
 *
 * @author ANDI DWI SAPUTRO
 */
public class Exercise1 {

    public static void main(String[] args) {
        File file = new File("C:/Users/x/Documents/GitHub");
        String[] fileList = file.list();
        for (String name : fileList) {
            System.out.println(name);
        }
    }
}
