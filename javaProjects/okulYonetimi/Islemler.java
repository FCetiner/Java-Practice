package javaProjects.okulYonetimi;

/*
	BÝR OKUL YÖNETÝM PLATFORMU KODALYINIZ.

	1.	Bu programda, Öðrenci ve Öðretmen Kayýtlarý ile ilgili iþlemler yapýlabilmelidir.
		Kayýtlarda þu bilgiler olabilmelidir.

		Öðretmen: Ad-Soyad,  kimlik No, yaþ, bölüm, ve sicil No bilgileri içermelidir.
		Öðrenci: Ad-Soyad,  kimlik No, yaþ, numara, sýnýf bilgileri içermelidir.

	2.	Program baþladýðýnda Kullanýcýya, Öðretmen ve Öðrenci iþlemlerini seçebilmesi için
		Aþaðýdaki gibi bir menü gösterilsin.

	====================================
	 ÖÐRENCÝ VE ÖÐRETMEN YÖNETÝM PANELÝ
	====================================
	 1- ÖÐRENCÝ ÝÞLEMLERÝ
	 2- ÖÐRETMEN ÝÞLEMLERÝ
	 Q- ÇIKIÞ

	3.	Seçilen Kiþi türüne göre aþaðýdaki iþlemleri gösteren bir alt menü daha gösterilsin.

	============= ÝÞLEMLER =============
		 1-EKLEME
		 2-ARAMA
		 3-LÝSTELEME
		 4-SÝLME
		 5-ANA MENÜ
		 Q-ÇIKIÞ

	SEÇÝMÝNÝZ:

	4.	Ýþlemler menüsünde seçilen iþleme göre bir önceki menüde seçilen Kiþi türü ile ilgili
	    ekleme, kimlik no ile silme ve arama, var olan tüm kiþileri listeleme gibi iþlemler yapýlabilmelidir.
		Bunun yanýnda bir üst menüye dönme veya çýkýþ iþlemleri de yapýlabilmelidir.

 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islemler {

	static List<Ogrenci> ogrenciList = new ArrayList<Ogrenci>();
	static List<Ogretmen> ogretmenList = new ArrayList<Ogretmen>();
	static String kisiTuru;
	static Scanner scan = new Scanner(System.in);

	public static void anaMenu() {
		System.out.println("====================================\nOGRENCI VE OGRETMEN YONETIM PANELI\n"
				+ "====================================\n" + "1- OGRENCI ISLEMLERI\n2- OGRETMEN ISLEMLERI\nQ- CIKIS");
		System.out.print("isleminiz seciniz : ");

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
		case "Q":
			cýkýs();
			break;
		default:
			System.out.println("hatali giris yaptiniz !!!");
			anaMenu();
			break;

		}

	}

	private static void cýkýs() {
		System.out.println("uygulamayi kullandiginiz için tesekkurler");
	}

	private static void islemMenusu() {
		System.out.println("============= ÝÞLEMLER =============\r\n" + "     1-EKLEME\r\n" + "     2-ARAMA\r\n"
				+ "     3-LÝSTELEME\r\n" + "     4-SÝLME\r\n" + "     0-ÇIKIÞ");

		System.out.println("islem tercihinizi giriniz : ");
		int islemTercihi = scan.nextInt();
		switch (islemTercihi) {
		case 0:
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
			listeleme();
			islemMenusu();
			break;
		case 4:
			 silme();
			islemMenusu();
			break;
		default:
			System.out.println("hatali giris yaptiniz :( ");
			islemMenusu();
			break;

		}
	}

	private static void arama() {
		System.out.println("*****Arama sayfasýna Hoþgeldiniz*****");
		if (kisiTuru.equalsIgnoreCase("Ogrenci")) {
			System.out.println("Aramak istediðiniz öðrenci no girin");
			String arananNo=scan.next();
			for (Ogrenci o : ogrenciList) {
				if (o.getNumara().equalsIgnoreCase(arananNo)) {
					System.out.println("aranan kiþi :" + o.getAdSoyad());
					islemMenusu();
				}
			}
		}
		if (kisiTuru.equalsIgnoreCase("Ogretmen")) {
			System.out.println("Aramak istediðiniz ogretmen sicil girin");
			String arananNo=scan.next();
			for (Ogretmen o : ogretmenList) {
				if (o.getSicilNo().equalsIgnoreCase(arananNo)) {
					System.out.println("aranan kiþi :" + o.getAdSoyad());
					islemMenusu();
				}
			}
		}
		
	}

	private static void silme() {
		System.out.println("*****Silme sayfasýna Hoþgeldiniz*****");
		if (kisiTuru.equalsIgnoreCase("Ogrenci")) {
			System.out.println("Silmek istediðiniz öðrenci no girin");
			String silinecekNo=scan.next();
			for (Ogrenci o : ogrenciList) {
				if (o.getNumara().equalsIgnoreCase(silinecekNo)) {
					System.out.println("silinen kiþi :" + o.getAdSoyad());
					ogrenciList.remove(o);
					islemMenusu();
				}
			}
		}
		if (kisiTuru.equalsIgnoreCase("Ogretmen")) {
			System.out.println("Silmek istediðiniz ogretmen sicil girin");
			String silinecekNo=scan.next();
			for (Ogretmen o : ogretmenList) {
				if (o.getSicilNo().equalsIgnoreCase(silinecekNo)) {
					System.out.println("silinen kiþi :" + o.getAdSoyad());
					ogrenciList.remove(o);
					islemMenusu();
				}
			}
		}
		
		
	}

	private static void listeleme() {
		if (kisiTuru.equalsIgnoreCase("Ogrenci")) {
			for (Ogrenci k : ogrenciList) {
				System.out.println(k.toString());
			}
			islemMenusu();
		}
		if (kisiTuru.equalsIgnoreCase("Ogretmen")) {
			for (Ogretmen k : ogretmenList) {
				System.out.println(k.toString());
			}
			islemMenusu();
		}


	}

	private static void ekleme() {
		Scanner scan=new Scanner(System.in);
		System.out.println("*****Ekleme menüsü*****");
		if(kisiTuru.equalsIgnoreCase("Ogrenci")) {
			System.out.println("Öðrenci ad soyadýný girin");
			String adSoyad=scan.nextLine();
			System.out.println("Öðrenci kimlik no girin");
			String kimlikNo=scan.next();
			System.out.println("Öðrenci yaþ girin");
			int ogrenciYas=scan.nextInt();
			System.out.println("Öðrenci Numarasý girin");
			String ogrenciNo=scan.next();
			System.out.println("Sýnýfýný girin");
			String sýnýf=scan.next();
			Ogrenci ogrenci1=new Ogrenci(adSoyad,kimlikNo,ogrenciYas,ogrenciNo,sýnýf);
			
			ogrenciList.add(ogrenci1);
			System.out.println("Öðrenci baþarýylar eklendi");
			islemMenusu();
		}
			if(kisiTuru.equalsIgnoreCase("Ogretmen")) {
				System.out.println("Ogretmen ad soyadýný girin");
				String adSoyad=scan.nextLine();
				System.out.println("Ogretmen kimlik no girin");
				String kimlikNo=scan.next();
				System.out.println("Ogretmen yaþ girin");
				int ogrenciYas=scan.nextInt();
				System.out.println("Sicil no girin");
				String sicilNo=scan.next();
				System.out.println("Bölüm girin");
				String bolum=scan.next();
				Ogretmen ogretmen1=new Ogretmen(adSoyad,kimlikNo,ogrenciYas,sicilNo,bolum);
				
				ogretmenList.add(ogretmen1);
				System.out.println("Öðretmen baþarýylar eklendi");
				islemMenusu();
			
		}
		scan.close();
    }


}
