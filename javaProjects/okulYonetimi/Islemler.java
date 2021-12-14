package javaProjects.okulYonetimi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
	BiR OKUL Y�NETiM PLATFORMU KODALYINIZ.

	1.	Bu programda, ��renci ve ��retmen Kay�tlar� ile ilgili i�lemler yap�labilmelidir.
		Kay�tlarda �u bilgiler olabilmelidir.

		��retmen: Ad-Soyad,  kimlik No, ya�, b�l�m, ve sicil No bilgileri i�ermelidir.
		��renci: Ad-Soyad,  kimlik No, ya�, numara, s�n�f bilgileri i�ermelidir.

	2.	Program ba�lad���nda Kullan�c�ya, ��retmen ve ��renci i�lemlerini se�ebilmesi i�in
		A�a��daki gibi bir men� g�sterilsin.

	====================================
	 ��RENCi VE ��RETMEN Y�NETiM PANELi
	====================================
	 1- ��RENCi i�LEMLERi
	 2- ��RETMEN i�LEMLERi
	 Q- �IKI�

	3.	Se�ilen Ki�i t�r�ne g�re a�a��daki i�lemleri g�steren bir alt men� daha g�sterilsin.

	============= i�LEMLER =============
		 1-EKLEME
		 2-ARAMA
		 3-LiSTELEME
		 4-SiLME
		 5-ANA MEN�
		 Q-�IKI�

	SE�iMiNiZ:

	4.	i�lemler men�s�nde se�ilen i�leme g�re bir �nceki men�de se�ilen Ki�i t�r� ile ilgili
	    ekleme, kimlik no ile silme ve arama, var olan t�m ki�ileri listeleme gibi i�lemler yap�labilmelidir.
		Bunun yan�nda bir �st men�ye d�nme veya ��k�� i�lemleri de yap�labilmelidir.

 */

public class Islemler {

	static List<Kisi> ogrenciList = new ArrayList<Kisi>();
	static List<Kisi> ogretmenList = new ArrayList<Kisi>();
	static Scanner scan = new Scanner(System.in);
	static String kisiTuru;

	public static void anaMenu() {
		System.out.println("====================================\n" + "     ��RENC� VE ��RETMEN Y�NET�M PANEL�\n"
				+ "    ====================================\n" + "     1- ��RENC� ��LEMLER�\n"
				+ "     2- ��RETMEN ��LEMLER�\n" + "     Q- �IKI�\n" + "");

		System.out.println("��leminizi se�in");
		String secim = scan.next().toUpperCase();

		switch (secim) {
		case "1":
			kisiTuru = "OGRENC�";
			islemMenusu();
			break;

		case "2":
			kisiTuru = "OGRETMEN";
			islemMenusu();
			break;
		case "0":
			c�k�s();
			break;

		default:
			System.out.println("Hatal� giri� yapt�n�z");
			anaMenu();
			break;

		}

	}

	private static void c�k�s() {
		System.out.println("Uygulamay� kulland�g�n�z i�in tesekkur ederiz");
		
	}

	private static void islemMenusu() {
		System.out.println("3. Se�ilen Ki�i t�r�ne g�re a�a��daki i�lemleri g�steren bir alt men� daha g�sterilsin.\r\n"
				+ "============= ��LEMLER =============\r\n" + "     1-EKLEME\r\n" + "     2-ARAMA\r\n"
				+ "     3-L�STELEME\r\n" + "     4-S�LME\r\n" + "     5-ANA MEN�\r\n" + "     Q-�IKI�");
		System.out.println("i�lem tercihinizi girin");
		int islemTercihi = scan.nextInt();
		switch (islemTercihi) {
		case 0:
	//		islemCikis();
			anaMenu();
			break;
		case 1:
			ekleme();
			islemMenusu();
			break;
		case 2:
			arama();
			islemMenusu();
			break;
		case 3:
	//		listeleme();
			islemMenusu();
			break;
		case 4:
			silme();
			islemMenusu();
			break;
		default:
			System.out.println("Hatal� giri� yapt�n�z");
			islemMenusu();
			break;
		}

	}

	private static void silme() {
		System.out.println("***** "+kisiTuru +" silme sayfas� *****");
		boolean kontrol=true;
		if (kisiTuru.equalsIgnoreCase("OGRENCI")) {
			System.out.println("silinecek ogrc kimlik no giriniz : ");
			String silOgrenciKimlik=scan.next();
			scan.nextLine();
		for (Kisi k : ogrenciList) {
			if (k.getKimlikNo().contains(silOgrenciKimlik)) {
				System.out.println("sildi�iniz ogrenci "+k.getAdSoyad());
				ogrenciList.remove(k.getKimlikNo());
				
				kontrol=false;
			}
		}
		if (kontrol==true) {
			System.out.println("Girdiginiz numara bulunmamaktad�r");
		}
		} else {
			System.out.println("silinecek ogrt sicil no giriniz : ");
			String silOgretmenSicil=scan.next();
			scan.nextLine();
		for (Kisi k : ogretmenList) {
			if (k.getKimlikNo().contains(silOgretmenSicil)) {
				System.out.println("sildi�iniz ogretmen "+k.getAdSoyad());
				ogretmenList.remove(k.getKimlikNo());
				
				kontrol=false;
			}
		}
		if (kontrol==true) {
			System.out.println("Girdiginiz numara bulunmamaktad�r");
		}
		}
		
	}

	private static void arama() {
		System.out.println("***** "+kisiTuru +" arama sayfas� *****");
		boolean kontrol=true;
		if (kisiTuru.equalsIgnoreCase("OGRENCI")) {
			System.out.println("Arad�g�n�z ogrc kimlik no giriniz : ");
			String ogrenciKimlik=scan.next();
			scan.nextLine();
		for (Kisi k : ogrenciList) {
			if (k.getKimlikNo().contains(ogrenciKimlik)) {
				System.out.println("arad�g�n�z ogrenci "+k.getAdSoyad());
				kontrol=false;
			}
		}
		if (kontrol==true) {
			System.out.println("Girdiginiz numara bulunmamaktad�r");
		}
		} else {
			System.out.println("Arad�g�n�z ogrt sicil no giriniz : ");
			String ogretmenSicil=scan.next();
			scan.nextLine();
		for (Kisi k : ogrenciList) {
			if (k.getKimlikNo().contains(ogretmenSicil)) {
				System.out.println("arad�g�n�z ogretmen "+k.getAdSoyad());
				kontrol=false;
			}
		}
		if (kontrol==true) {
			System.out.println("Girdiginiz numara bulunmamaktad�r");
		}
		}
	}

	private static void ekleme() {
		System.out.println("***** "+kisiTuru +" ekleme sayfas� *****");
		System.out.println("Ad soyad giriniz");
		scan.nextLine();
		String adSoyad=scan.nextLine();
		System.out.println("Kimlik nogiriniz");
		String kimlikNo=scan.next();
		System.out.println("Ya� giriniz");
		int yas=scan.nextInt();
		if (kisiTuru.equalsIgnoreCase("ogrenci")) {
			System.out.println("�grenci no giriniz : ");
			String numara = scan.next();
			System.out.println("S�n�f giriniz : ");
			String s�n�f = scan.next();
			
			Ogrenci ogrenci = new Ogrenci(adSoyad,kimlikNo,yas,numara,s�n�f);
			ogrenciList.add(ogrenci);
			System.out.println(ogrenci.toString());
		} else if (kisiTuru.equalsIgnoreCase("ogrenci")){
			System.out.println("Sicil no giriniz : ");
			String sicilNo = scan.next();
			System.out.println("B�l�m giriniz : ");
			String bolum = scan.next();
			
			Ogretmen ogretmen = new Ogretmen(adSoyad,kimlikNo,yas,sicilNo,bolum);
			ogrenciList.add(ogretmen);
			System.out.println(ogretmen.toString());
		}
		
		
		
	}

}
