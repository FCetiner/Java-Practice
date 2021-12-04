package _05_StringManipulation;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        //Kullanýcýdan alacaðýnýz, 3 kelimeden oluþan ismi
        // örn. Ahmet Emin Yýlmaz -> A.E.Y.  formatýyla yazdýrýnýz.

    	Scanner scan = new Scanner(System.in);
    	System.out.print("Ýsminizi giriniz:");
    	String isim = scan.nextLine();
    	
    	isim = isim.toUpperCase().charAt(0)+"."+isim.toUpperCase().charAt(isim.indexOf(' ')+1)+"."+ 
    				  isim.toUpperCase().charAt(isim.lastIndexOf(' ')+1)+".";
    	
    	System.out.println(isim);

    	scan.close();
	}
}
