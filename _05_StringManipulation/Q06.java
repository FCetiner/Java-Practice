package _05_StringManipulation;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
       /*
       kullanýcýdan bir e-posta adresi girmesini isteyin, ardýndan "hotmail" içeriyorsa, "gmail" ile deðiÅŸtirin,
        örneðin: johnbrown@hotmail.com ==> johnbrown@gmail.com
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
