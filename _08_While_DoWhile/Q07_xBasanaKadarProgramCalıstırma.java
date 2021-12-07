package _08_While_DoWhile;

import java.util.Scanner;

public class Q07_xBasanaKadarProgramCalýstýrma {

    public static void main(String[] args) {
        // Kullanýcýda x  girilene kadar ekrana "Program çalýþýyor" yazan
        // ve x girildiðinde ise "Program bitti" yazan programý yazýnýz.

    	Scanner scan=new Scanner(System.in);
    	System.out.print("Programý kapatmak için x'e basýn");
    	char krk= scan.next().toLowerCase().charAt(0);
		
		while (krk!='x') {
			System.out.println("Program çalýþýyor");
			krk= scan.next().toLowerCase().charAt(0);
		}
			
		System.out.println("Program bitti");
		
		scan.close();
		
    }
}
