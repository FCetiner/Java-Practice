package _05_StringManipulation;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        //Kullan�c�dan alaca��n�z, 3 kelimeden olu�an ismi
        // �rn. Ahmet Emin Y�lmaz -> A.E.Y.  format�yla yazd�r�n�z.

    	Scanner scan = new Scanner(System.in);
    	System.out.print("�sminizi giriniz:");
    	String isim = scan.nextLine();
    	
    	isim = isim.toUpperCase().charAt(0)+"."+isim.toUpperCase().charAt(isim.indexOf(' ')+1)+"."+ 
    				  isim.toUpperCase().charAt(isim.lastIndexOf(' ')+1)+".";
    	
    	System.out.println(isim);

    	scan.close();
	}
}
