package _07_ForLoop;

import java.util.Scanner;

public class Q13 {
	
	
	public static void main(String[] args) {
		
		/*
         * Kullanicidan bir cumle ve bir harf alin,
         * Cumlede harfin kac kere
         * kullanildigini bulup, yazdirin
         *
         * ORNEK:
         *
         * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
         *
         * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
         */

		
		Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir cümle girin : ");
        String cumle = scan.nextLine().toLowerCase();
        System.out.print("Lütfen bir harf girin : ");
		char harf=scan.next().toLowerCase().charAt(0);
		int sayac=0;
		
		for (int i = 0; i < cumle.length(); i++) {
			if (cumle.charAt(i)==harf) {
				sayac++;
			} 
		}
		
		
		System.out.println("girdiðiniz cümelede " + harf + " harfi " + sayac + " kere kullanýlmýþtýr.");
		
		
		scan.close();
		
	}

}
