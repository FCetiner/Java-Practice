package _06_Method_Creation;

import java.util.Scanner;

public class Q07 {
 public static void main(String[] args) {  
	 /*
        reverseString isminde bir method olu�turun.
        Bu method bir String'i parametre olarak als�n.
        Ve bu method, girilen String'i tersten yazs�n.
        Terste yaz�lm�� halini yazd�r�n�z.

        �rn: String = "Java'y� Seviyorum."
        Print: .muroyiveS �y'avaJ
         */
	 Scanner scan = new Scanner(System.in);
     System.out.print("Cumle giriniz: ");
     String str = scan.nextLine();

     System.out.println(reverseString(str));

scan.close();
 }

 public static String reverseString(String str) {

     String str2 = str.trim();

     String strTers = "";

     for (int i = str2.length() - 1; i >= 0; i--) {

         strTers += str2.charAt(i);
     }

     return strTers;
 }
}

/*
String[] arr =  str.trim().replaceAll("\\s+"," ").split("");
     String strTers = "";
     for (int i = arr.length-1; i >= 0; i--) {
         strTers += arr[i];
     }
     return strTers;
 }
}
*/