package _05_StringManipulation;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        // Kullanýcýdan tek seferde alacaðýnýz 2 kelimelik ad soyadý 2 ayrý kelimeye ayýrýnýz,
        // ad ayrý soyad ayrý sekilde ekrana yazdýrýnýz.

    	Scanner scan = new Scanner(System.in);
    	System.out.print("Ýsim ve Soyisminizi giriniz:");
    	String str = scan.nextLine();
       
    	String isim= str.substring(0,str.indexOf(" "));
    	String soyIsim = str.substring(str.indexOf(" ")+1);
    	
    	System.out.println("isminiz\t:"+ isim + "\nSoyisminiz\t:" + soyIsim);
   scan.close();
    }
}
