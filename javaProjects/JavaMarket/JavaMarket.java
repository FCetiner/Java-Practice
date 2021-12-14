package javaProjects.JavaMarket;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class JavaMarket {

	static List<String> urunler = new ArrayList<>(Arrays.asList("Domates", "Patates", "Biber", "Sogan",
			"Havu�", "Elma", "Muz", "�ilek", "Kavun", "�z�m", "Limon"));
	static List<Double> fiyatlar = new ArrayList<>(
			Arrays.asList(2.10, 3.20, 1.50, 2.30, 3.10, 1.20, 1.90, 6.10, 4.30, 2.70, 0.50));
	static List<String> sepetUrunlerin = new ArrayList<>();
	static List<Double> sepetKg = new ArrayList<>();
	static List<Double> sepetFiyat = new ArrayList<>();
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		/*
		 * Basarili Market al��-veri� program�.
		 *
		 * 1. Ad�m: �r�nler ve fiyatlar� i�eren listeleri olu�turunuz. No �r�n Fiyat
		 * ==== ======= ========= 00 Domates 2.10 TL 01 Patates 3.20 TL 02 Biber 1.50 TL
		 * 03 So�an 2.30 TL 04 Havu� 3.10 TL 05 Elma 1.20 TL 06 Muz 1.90 TL 07 �ilek
		 * 6.10 TL 08 Kavun 4.30 TL 09 �z�m 2.70 TL 10 Limon 0.50 TL
		 * 
		 * 2. Ad�m: Kullan�c�n�n �r�n nosuna g�re listeden �r�n se�mesini isteyiniz. 3.
		 * Ad�m: Ka� kg sat�n almak istedi�ini sorunuz. 4. Ad�m: Al�nacak bu �r�n�
		 * sepete ekleyiniz ve Sepeti yazd�r�n�z. 5. Ba�ka bir �r�n al�p almak
		 * istemedi�ini sorunuz. 6. E�er devam etmek istiyorsa yeniden �r�n se�me
		 * k�sm�na y�nlendiriniz. 7. E�er bitirmek istiyorsa �demeyi kontrol edip para
		 * ustu hesaplayarak program� bitirinzi.
		 */

		
		String devam="";
		double toplamFiyat=0;
		
		do {
		urunListesi();
		System.out.print("�r�n kodunu giriniz :");
			int urunNo=scan.nextInt();
		System.out.println("ka� kilo alacaks�n�z : ");
			double kg=scan.nextDouble();
		sepeteEkle(urunNo,kg);
		toplamFiyat=sepetTutar�();
		System.out.println("Devam edecekseniz e yaz�n�z?");
		devam=scan.next();
		//scan.nextLine(); 	//Dummy kukla e den sonra ba�a d�nmemesi i�in
			
			
			
		} while (devam.equalsIgnoreCase("e"));
		odeme(toplamFiyat);
		
		
	scan.close();
	}

	private static double sepetTutar�() {
		double sepetTutar=0;
		double sepetKilo=0;
		
		for (int i = 0; i < sepetUrunlerin.size(); i++) {
			sepetTutar+=sepetFiyat.get(i);
			sepetKilo+=sepetKg.get(i);
		}
		System.out.println("toplam odemeniz gereken miktar : " + sepetTutar+ "Ald�g�n�z �r�n miktar� : " + sepetKilo);
		return sepetTutar;
	}

	private static void odeme(double toplamFiyat) {
		System.out.println("Odemeniz gereken miktar : " +toplamFiyat);
		double nakit=0;
		
		do {
			System.out.println("L�tfen nakit odemenizi girin : ");
			nakit+=scan.nextDouble();
			if(nakit<toplamFiyat) {
				System.out.println("Eksik odeme yapt�n�z"+(toplamFiyat-nakit)+ " daha odeme yap�n�z.");
			}
			
			
			
		} while (nakit<toplamFiyat);
		double paraUstu=nakit-toplamFiyat;
		if (paraUstu>0) {
			System.out.println("para �st�n�z : " + paraUstu);
		}
		System.out.println("yine bekleriz iyi g�nler");
	}

	private static void sepeteEkle(int urunNo, double kg) {
		sepetUrunlerin.add(urunler.get(urunNo));
		sepetKg.add(kg);
		sepetFiyat.add(fiyatlar.get(urunNo)*kg);
		
	}

	private static void urunListesi() {

		System.out.println("No\t Urunler\t Fiyatlar");
		System.out.println("***\t *******\t *******");
		
		for (int i = 0; i < urunler.size(); i++) {
			System.out.println(" "+i+"\t"+urunler.get(i)+"\t\t"+fiyatlar.get(i));
		}
	}
}
