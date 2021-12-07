package _08_While_DoWhile;

import java.util.Scanner;

public class Q12_YereBýrakýlanTopunMesafesiniBulma {

    //Bir top belirli bir  yükseklükten atýlmaktadýr.
    // Atýldýktan sonra, atýldýðý yükseklüðün 3/4 u kadar yerden yukarý doðru zýplamaktadýr
    // Top zýplama  yükseklüðü 1 metrenün altýna ündüðünde durmaktadýr.
    // Bu ana kadar aldügü toplam yolu ve yere vurma sayýsýný bulunuz.

    public static void main(String[] args) {
		
    	Scanner scan=new Scanner(System.in);
    	System.out.println("Lütfen yükseklik girin : ");
		double yukseklik=scan.nextDouble();
    	
		
		double topToplamYol=0;
    	int yereVurmaSayýsý=0;
    	
    	do {
			yereVurmaSayýsý++;
			topToplamYol+=yukseklik;
			yukseklik*=(0.75);
			topToplamYol+=yukseklik;
		} while (yukseklik>=1);
    
    	
    	System.out.println("Topun toplam yolu : " + topToplamYol+ "\nyere vurma sayýsý : "+ yereVurmaSayýsý);
    	
    	scan.close();
	}
}
