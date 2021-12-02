package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q08 {
	/*
	 * Problem tanimi : 
	 * 
	 * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
	 * musteri karti olup olmadigini sorun
	 * 
	 * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin 
	 * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
	 * alirsa %10 indirim yapin
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Ald���n�z �r�n adedi:");
		int adet = scan.nextInt();
		System.out.println("Liste fiyat�n� girin:");
		double fiyat = scan.nextDouble();
		System.out.println("M��teri kart�n�z var ise 'E' yok ise 'H' giriniz:");
		char kart= scan.next().toUpperCase().charAt(0);
		
		
		if (kart=='E') {
		
			if(adet>10) {
				System.out.println("indiriminiz  : " + ((adet*fiyat)*20/100));
			}else {
				System.out.println("indiriminiz  :" + ((adet*fiyat)*15/100));
			 }
		
		} else if(kart=='H') {

			if (adet>10) {
				System.out.println("indiriminiz  :" + ((adet*fiyat)*15/100));
			}else {
				System.out.println("indiriminiz  :" + ((adet*fiyat)*10/100));
			}
			
			
		} else {
			System.out.println("Ge�erli bir karakter giriniz");
		}
		
		
				
	

	scan.close();	
		
		
	}

}
