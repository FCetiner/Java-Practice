package _08_While_DoWhile;

import java.util.Scanner;

public class Q07_xBasanaKadarProgramCal�st�rma {

    public static void main(String[] args) {
        // Kullan�c�da x  girilene kadar ekrana "Program �al���yor" yazan
        // ve x girildi�inde ise "Program bitti" yazan program� yaz�n�z.

    	Scanner scan=new Scanner(System.in);
    	System.out.print("Program� kapatmak i�in x'e bas�n");
    	char krk= scan.next().toLowerCase().charAt(0);
		
		while (krk!='x') {
			System.out.println("Program �al���yor");
			krk= scan.next().toLowerCase().charAt(0);
		}
			
		System.out.println("Program bitti");
		
		scan.close();
		
    }
}
