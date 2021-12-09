package _10_List;

import java.util.Scanner;

public class QMarket {
	/*
	 * Bir bakkal�n 7 g�nl�k t�m kazan�lar�n� g�nl�k olarak g�steren bir program
	 * yaz�n�z. Ayr�ca bakkal�n bu hafta ortalama kazand��� miktar� g�steren bir
	 * method yaz�n�z. Ayr�ca bakkal�n hangi g�nler ortalaman�n �st�ne kazand���n�
	 * g�steren bir method yaz�n�z. Ayr�ca bakkal�n hangi g�nler ortalaman�n alt�nda
	 * kazand���n� g�steren bir method yaz�n�z.
	 *
	 * 1. Ad�m : G�nleri i�eren bir tane ArrayList olu�turun. (gunler) 
	 * 2. Ad�m : G�nl�k kazan�lar� ekleyece�imiz bir tane ArrayList olu�turun.(gunlukKazanclar) 
	 * 3. Ad�m : While d�ng�s� ile kullan�c�dan 7 g�nl�k kazan�lar� tekek teker al�p gunlukKazanclar ArrayList'e ekle. 
	 * 4. Ad�m : getOrtalamaKazanc() adl� method ile ortalama kazanc� al�n. 
	 * 5. Ad�m : getOrtalamaninUstundeKazancG�nleri() adl� method olu�turun. for d�ng�s� ile
	 * t�m g�nleri ortalama kazan� ile kar��la�t�r ortalama kazan�tan y�ksekse o g�nleri return yap.
	 * 6. Ad�m : getOrtalamaninAltindaKazancG�nleri() adl� method olu�turun. for d�ng�s� ile t�m g�nleri ortalama kazan� ile kar��la�t�r
	 * ortalama kazan�tan a�a��ysa o g�nleri return yap.
	 */
	static String gunler[] = { "pazartesi", "sal�", "carsamba", "persembe", "cuma", "cumartesi", "pazar" };
	static Double gunlukKazanclar[] = new Double[7];
	static double ortalamaKazanc;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int count = 0;
		while (count < 7) {
			System.out.println(gunler[count] + " g�n�n�n kazanc�n� giriniz : ");
			double kazanc = scan.nextDouble();
			gunlukKazanclar[count] = kazanc;
			count++;
		}

		System.out.println("ortalama kazanc�n�z : " + getOrtalamaKazanc() + "\nKar etti�iniz gunler : " + getOrtalamaninUstundeKazancG�nleri()
		+ "\nZarar etti�iniz gunler : " +getOrtalamaninAltindaKazancG�nleri() );

		scan.close();
	}

	private static String getOrtalamaninAltindaKazancG�nleri() {
		String zararl�Gunler="";
		for (int i = 0; i < gunlukKazanclar.length; i++) {
			if (gunlukKazanclar[i]<ortalamaKazanc) {
				zararl�Gunler+= gunler[i] + " ";
			}
		}
	 return zararl�Gunler;
		
	}

	private static String getOrtalamaninUstundeKazancG�nleri() {
		String karl�Gunler="";
		for (int i = 0; i < gunlukKazanclar.length; i++) {
			if (gunlukKazanclar[i]>ortalamaKazanc) {
				karl�Gunler+= gunler[i] + " ";
			}
		}
	 return karl�Gunler;
		

	}

	private static double getOrtalamaKazanc() {
		int toplam = 0;
		for (int i = 0; i < gunlukKazanclar.length; i++) {
			toplam += gunlukKazanclar[i];
		}
		ortalamaKazanc = toplam / gunlukKazanclar.length;
		return ortalamaKazanc;
	}
}