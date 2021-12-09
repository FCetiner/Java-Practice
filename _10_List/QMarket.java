package _10_List;

import java.util.Scanner;

public class QMarket {
	/*
	 * Bir bakkalýn 7 günlük tüm kazançlarýný günlük olarak gösteren bir program
	 * yazýnýz. Ayrýca bakkalýn bu hafta ortalama kazandýðý miktarý gösteren bir
	 * method yazýnýz. Ayrýca bakkalýn hangi günler ortalamanýn üstüne kazandýðýný
	 * gösteren bir method yazýnýz. Ayrýca bakkalýn hangi günler ortalamanýn altýnda
	 * kazandýðýný gösteren bir method yazýnýz.
	 *
	 * 1. Adým : Günleri içeren bir tane ArrayList oluþturun. (gunler) 
	 * 2. Adým : Günlük kazançlarý ekleyeceðimiz bir tane ArrayList oluþturun.(gunlukKazanclar) 
	 * 3. Adým : While döngüsü ile kullanýcýdan 7 günlük kazançlarý tekek teker alýp gunlukKazanclar ArrayList'e ekle. 
	 * 4. Adým : getOrtalamaKazanc() adlý method ile ortalama kazancý alýn. 
	 * 5. Adým : getOrtalamaninUstundeKazancGünleri() adlý method oluþturun. for döngüsü ile
	 * tüm günleri ortalama kazanç ile karþýlaþtýr ortalama kazançtan yüksekse o günleri return yap.
	 * 6. Adým : getOrtalamaninAltindaKazancGünleri() adlý method oluþturun. for döngüsü ile tüm günleri ortalama kazanç ile karþýlaþtýr
	 * ortalama kazançtan aþaðýysa o günleri return yap.
	 */
	static String gunler[] = { "pazartesi", "salý", "carsamba", "persembe", "cuma", "cumartesi", "pazar" };
	static Double gunlukKazanclar[] = new Double[7];
	static double ortalamaKazanc;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int count = 0;
		while (count < 7) {
			System.out.println(gunler[count] + " gününün kazancýný giriniz : ");
			double kazanc = scan.nextDouble();
			gunlukKazanclar[count] = kazanc;
			count++;
		}

		System.out.println("ortalama kazancýnýz : " + getOrtalamaKazanc() + "\nKar ettiðiniz gunler : " + getOrtalamaninUstundeKazancGünleri()
		+ "\nZarar ettiðiniz gunler : " +getOrtalamaninAltindaKazancGünleri() );

		scan.close();
	}

	private static String getOrtalamaninAltindaKazancGünleri() {
		String zararlýGunler="";
		for (int i = 0; i < gunlukKazanclar.length; i++) {
			if (gunlukKazanclar[i]<ortalamaKazanc) {
				zararlýGunler+= gunler[i] + " ";
			}
		}
	 return zararlýGunler;
		
	}

	private static String getOrtalamaninUstundeKazancGünleri() {
		String karlýGunler="";
		for (int i = 0; i < gunlukKazanclar.length; i++) {
			if (gunlukKazanclar[i]>ortalamaKazanc) {
				karlýGunler+= gunler[i] + " ";
			}
		}
	 return karlýGunler;
		

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