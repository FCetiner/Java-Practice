package _05_StringManipulation;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        // Kullan�c�dan tek seferde alaca��n�z 2 kelimelik ad soyad� 2 ayr� kelimeye ay�r�n�z,
        // ad ayr� soyad ayr� sekilde ekrana yazd�r�n�z.

    	Scanner scan = new Scanner(System.in);
    	System.out.print("�sim ve Soyisminizi giriniz:");
    	String str = scan.nextLine();
       
    	String isim= str.substring(0,str.indexOf(" "));
    	String soyIsim = str.substring(str.indexOf(" ")+1);
    	
    	System.out.println("isminiz\t:"+ isim + "\nSoyisminiz\t:" + soyIsim);
   scan.close();
    }
}
