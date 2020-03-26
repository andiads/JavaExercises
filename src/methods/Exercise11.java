/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

/**
 *
 * @author ANDI DWI SAPUTRO
 */
public class Exercise11 {

    public static void main(String[]args){
        String pwd = "abcd1234";
        System.out.print(
                "1. A password must have at least eight characters.\n" +
                "2. A password consists of only letters and digits.\n" +
                "3. A password must contain at least two digits \n" +
                "Input a password (You are agreeing to the above Terms and Conditions.): ");
        
        if (isValidPassword(pwd)){
            System.out.println("valid!");
        } else {
            System.out.println("invalid password!");
        }
    }
    
    public static boolean isValidPassword(String pw){
        if (pw.length()<8) return false;
        int chCount = 0;
        int numCount = 0;
        for (int i = 0; i< pw.length(); i++){
            char ch = pw.charAt(i);
            ch = Character.toUpperCase(ch);
            if (ch>='A'&&ch<='Z') {
                chCount++;
            }
            else if (ch>='0'&&ch<='9'){
                numCount++;
            } else {
                return false;
            }
        }
        return (chCount >=2 && numCount >= 2);
    }
}
