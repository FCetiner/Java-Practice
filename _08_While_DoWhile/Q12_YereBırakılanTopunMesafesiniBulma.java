package _08_While_DoWhile;

import java.util.Scanner;

public class Q12_YereB�rak�lanTopunMesafesiniBulma {

    //Bir top belirli bir  y�ksekl�kten at�lmaktad�r.
    // At�ld�ktan sonra, at�ld��� y�ksekl���n 3/4 u kadar yerden yukar� do�ru z�plamaktad�r
    // Top z�plama  y�ksekl��� 1 metren�n alt�na �nd���nde durmaktad�r.
    // Bu ana kadar ald�g� toplam yolu ve yere vurma say�s�n� bulunuz.

    public static void main(String[] args) {
		
    	Scanner scan=new Scanner(System.in);
    	System.out.println("L�tfen y�kseklik girin : ");
		double yukseklik=scan.nextDouble();
    	
		
		double topToplamYol=0;
    	int yereVurmaSay�s�=0;
    	
    	do {
			yereVurmaSay�s�++;
			topToplamYol+=yukseklik;
			yukseklik*=(0.75);
			topToplamYol+=yukseklik;
		} while (yukseklik>=1);
    
    	
    	System.out.println("Topun toplam yolu : " + topToplamYol+ "\nyere vurma say�s� : "+ yereVurmaSay�s�);
    	
    	scan.close();
	}
}
