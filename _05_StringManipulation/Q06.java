package _05_StringManipulation;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
       /*
       kullan�c�dan bir e-posta adresi girmesini isteyin, ard�ndan "hotmail" i�eriyorsa, "gmail" ile de�iştirin,
        �rne�in: johnbrown@hotmail.com ==> johnbrown@gmail.com
        */

    	Scanner scan = new Scanner(System.in);
    	System.out.print("email adresinizi giriniz:");
    	String mail = scan.nextLine();
    	
    	if (mail.contains("hotmail")) {
			System.out.println(mail.replace("hotmail", "gmail"));
		}
    	scan.close();
    }
}
