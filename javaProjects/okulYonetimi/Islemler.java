package javaProjects.okulYonetimi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
	BiR OKUL YÖNETiM PLATFORMU KODALYINIZ.

	1.	Bu programda, Öðrenci ve Öðretmen Kayýtlarý ile ilgili iþlemler yapýlabilmelidir.
		Kayýtlarda þu bilgiler olabilmelidir.

		Öðretmen: Ad-Soyad,  kimlik No, yaþ, bölüm, ve sicil No bilgileri içermelidir.
		Öðrenci: Ad-Soyad,  kimlik No, yaþ, numara, sýnýf bilgileri içermelidir.

	2.	Program baþladýðýnda Kullanýcýya, Öðretmen ve Öðrenci iþlemlerini seçebilmesi için
		Aþaðýdaki gibi bir menü gösterilsin.

	====================================
	 ÖÐRENCi VE ÖÐRETMEN YÖNETiM PANELi
	====================================
	 1- ÖÐRENCi iÞLEMLERi
	 2- ÖÐRETMEN iÞLEMLERi
	 Q- ÇIKIÞ

	3.	Seçilen Kiþi türüne göre aþaðýdaki iþlemleri gösteren bir alt menü daha gösterilsin.

	============= iÞLEMLER =============
		 1-EKLEME
		 2-ARAMA
		 3-LiSTELEME
		 4-SiLME
		 5-ANA MENÜ
		 Q-ÇIKIÞ

	SEÇiMiNiZ:

	4.	iþlemler menüsünde seçilen iþleme göre bir önceki menüde seçilen Kiþi türü ile ilgili
	    ekleme, kimlik no ile silme ve arama, var olan tüm kiþileri listeleme gibi iþlemler yapýlabilmelidir.
		Bunun yanýnda bir üst menüye dönme veya çýkýþ iþlemleri de yapýlabilmelidir.

 */

public class Islemler {

	static List<Kisi> ogrenciList = new ArrayList<Kisi>();
	static List<Kisi> ogretmenList = new ArrayList<Kisi>();
	static Scanner scan = new Scanner(System.in);
	static String kisiTuru;

	public static void anaMenu() {
		System.out.println("====================================\n" + "     ÖÐRENCÝ VE ÖÐRETMEN YÖNETÝM PANELÝ\n"
				+ "    ====================================\n" + "     1- ÖÐRENCÝ ÝÞLEMLERÝ\n"
				+ "     2- ÖÐRETMEN ÝÞLEMLERÝ\n" + "     Q- ÇIKIÞ\n" + "");

		System.out.println("Ýþleminizi seçin");
		String secim = scan.next().toUpperCase();

		switch (secim) {
		case "1":
			kisiTuru = "OGRENCÝ";
			islemMenusu();
			break;

		case "2":
			kisiTuru = "OGRETMEN";
			islemMenusu();
			break;
		case "0":
			cýkýs();
			break;

		default:
			System.out.println("Hatalý giriþ yaptýnýz");
			anaMenu();
			break;

		}

	}

	private static void cýkýs() {
		System.out.println("Uygulamayý kullandýgýnýz için tesekkur ederiz");
		
	}

	private static void islemMenusu() {
		System.out.println("3. Seçilen Kiþi türüne göre aþaðýdaki iþlemleri gösteren bir alt menü daha gösterilsin.\r\n"
				+ "============= ÝÞLEMLER =============\r\n" + "     1-EKLEME\r\n" + "     2-ARAMA\r\n"
				+ "     3-LÝSTELEME\r\n" + "     4-SÝLME\r\n" + "     5-ANA MENÜ\r\n" + "     Q-ÇIKIÞ");
		System.out.println("iþlem tercihinizi girin");
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
			System.out.println("Hatalý giriþ yaptýnýz");
			islemMenusu();
			break;
		}

	}

	private static void silme() {
		System.out.println("***** "+kisiTuru +" silme sayfasý *****");
		boolean kontrol=true;
		if (kisiTuru.equalsIgnoreCase("OGRENCI")) {
			System.out.println("silinecek ogrc kimlik no giriniz : ");
			String silOgrenciKimlik=scan.next();
			scan.nextLine();
		for (Kisi k : ogrenciList) {
			if (k.getKimlikNo().contains(silOgrenciKimlik)) {
				System.out.println("sildiðiniz ogrenci "+k.getAdSoyad());
				ogrenciList.remove(k.getKimlikNo());
				
				kontrol=false;
			}
		}
		if (kontrol==true) {
			System.out.println("Girdiginiz numara bulunmamaktadýr");
		}
		} else {
			System.out.println("silinecek ogrt sicil no giriniz : ");
			String silOgretmenSicil=scan.next();
			scan.nextLine();
		for (Kisi k : ogretmenList) {
			if (k.getKimlikNo().contains(silOgretmenSicil)) {
				System.out.println("sildiðiniz ogretmen "+k.getAdSoyad());
				ogretmenList.remove(k.getKimlikNo());
				
				kontrol=false;
			}
		}
		if (kontrol==true) {
			System.out.println("Girdiginiz numara bulunmamaktadýr");
		}
		}
		
	}

	private static void arama() {
		System.out.println("***** "+kisiTuru +" arama sayfasý *****");
		boolean kontrol=true;
		if (kisiTuru.equalsIgnoreCase("OGRENCI")) {
			System.out.println("Aradýgýnýz ogrc kimlik no giriniz : ");
			String ogrenciKimlik=scan.next();
			scan.nextLine();
		for (Kisi k : ogrenciList) {
			if (k.getKimlikNo().contains(ogrenciKimlik)) {
				System.out.println("aradýgýnýz ogrenci "+k.getAdSoyad());
				kontrol=false;
			}
		}
		if (kontrol==true) {
			System.out.println("Girdiginiz numara bulunmamaktadýr");
		}
		} else {
			System.out.println("Aradýgýnýz ogrt sicil no giriniz : ");
			String ogretmenSicil=scan.next();
			scan.nextLine();
		for (Kisi k : ogrenciList) {
			if (k.getKimlikNo().contains(ogretmenSicil)) {
				System.out.println("aradýgýnýz ogretmen "+k.getAdSoyad());
				kontrol=false;
			}
		}
		if (kontrol==true) {
			System.out.println("Girdiginiz numara bulunmamaktadýr");
		}
		}
	}

	private static void ekleme() {
		System.out.println("***** "+kisiTuru +" ekleme sayfasý *****");
		System.out.println("Ad soyad giriniz");
		scan.nextLine();
		String adSoyad=scan.nextLine();
		System.out.println("Kimlik nogiriniz");
		String kimlikNo=scan.next();
		System.out.println("Yaþ giriniz");
		int yas=scan.nextInt();
		if (kisiTuru.equalsIgnoreCase("ogrenci")) {
			System.out.println("Ögrenci no giriniz : ");
			String numara = scan.next();
			System.out.println("Sýnýf giriniz : ");
			String sýnýf = scan.next();
			
			Ogrenci ogrenci = new Ogrenci(adSoyad,kimlikNo,yas,numara,sýnýf);
			ogrenciList.add(ogrenci);
			System.out.println(ogrenci.toString());
		} else if (kisiTuru.equalsIgnoreCase("ogrenci")){
			System.out.println("Sicil no giriniz : ");
			String sicilNo = scan.next();
			System.out.println("Bölüm giriniz : ");
			String bolum = scan.next();
			
			Ogretmen ogretmen = new Ogretmen(adSoyad,kimlikNo,yas,sicilNo,bolum);
			ogrenciList.add(ogretmen);
			System.out.println(ogretmen.toString());
		}
		
		
		
	}

}
