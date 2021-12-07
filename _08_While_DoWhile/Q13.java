package _08_While_DoWhile;

import java.util.Scanner;

public class Q13 {

    public static void main(String[] args) {
        /*
         * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
         * musteri karti olup olmadigini sorun
         *
         * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
         * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az alirsa %10
         * indirim yapin
         */

    	Scanner scan=new Scanner(System.in);
		System.out.print("�r�n adedini girin:");
		int adet= scan.nextInt();
		System.out.print("Liste fiyat�n� girin:");
		int fiyat= scan.nextInt();
		System.out.print("M��teri kart�n�z var ise 'E' yok ise 'H' girin");
		char kart= scan.next().toUpperCase().charAt(0);
		
		
		
		
		while (kart=='E') {
			if (adet<10) {
				System.out.println("Y�zde 15 indirimli fiyat�n�z : " +(adet*fiyat*0.85));
				break;
			} else {
				System.out.println("Y�zde 20 indirimli fiyat�n�z : " +(adet*fiyat*0.80));
				break;
			}
		}
		
		while (kart=='H') {
			if (adet<10) {
				System.out.println("Y�zde 10 indirimli fiyat�n�z : " +(adet*fiyat*0.90));
				break;
			} else {
				System.out.println("Y�zde 15 indirimli fiyat�n�z : " +(adet*fiyat*0.85));
				break;
			}
		}
    
    
    
    scan.close();
    
    }
    
}
