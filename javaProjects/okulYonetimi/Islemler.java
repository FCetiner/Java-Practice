package javaProjects.okulYonetimi;

/*
	B�R OKUL Y�NET�M PLATFORMU KODALYINIZ.

	1.	Bu programda, ��renci ve ��retmen Kay�tlar� ile ilgili i�lemler yap�labilmelidir.
		Kay�tlarda �u bilgiler olabilmelidir.

		��retmen: Ad-Soyad,  kimlik No, ya�, b�l�m, ve sicil No bilgileri i�ermelidir.
		��renci: Ad-Soyad,  kimlik No, ya�, numara, s�n�f bilgileri i�ermelidir.

	2.	Program ba�lad���nda Kullan�c�ya, ��retmen ve ��renci i�lemlerini se�ebilmesi i�in
		A�a��daki gibi bir men� g�sterilsin.

	====================================
	 ��RENC� VE ��RETMEN Y�NET�M PANEL�
	====================================
	 1- ��RENC� ��LEMLER�
	 2- ��RETMEN ��LEMLER�
	 Q- �IKI�

	3.	Se�ilen Ki�i t�r�ne g�re a�a��daki i�lemleri g�steren bir alt men� daha g�sterilsin.

	============= ��LEMLER =============
		 1-EKLEME
		 2-ARAMA
		 3-L�STELEME
		 4-S�LME
		 5-ANA MEN�
		 Q-�IKI�

	SE��M�N�Z:

	4.	��lemler men�s�nde se�ilen i�leme g�re bir �nceki men�de se�ilen Ki�i t�r� ile ilgili
	    ekleme, kimlik no ile silme ve arama, var olan t�m ki�ileri listeleme gibi i�lemler yap�labilmelidir.
		Bunun yan�nda bir �st men�ye d�nme veya ��k�� i�lemleri de yap�labilmelidir.

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
			kisiTuru = "OGRENC�";
			islemMenusu();
			break;
		case "2":
			kisiTuru = "OGRETMEN";
			islemMenusu();
			break;
		case "Q":
			c�k�s();
			break;
		default:
			System.out.println("hatali giris yaptiniz !!!");
			anaMenu();
			break;

		}

	}

	private static void c�k�s() {
		System.out.println("uygulamayi kullandiginiz i�in tesekkurler");
	}

	private static void islemMenusu() {
		System.out.println("============= ��LEMLER =============\r\n" + "     1-EKLEME\r\n" + "     2-ARAMA\r\n"
				+ "     3-L�STELEME\r\n" + "     4-S�LME\r\n" + "     0-�IKI�");

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
		System.out.println("*****Arama sayfas�na Ho�geldiniz*****");
		if (kisiTuru.equalsIgnoreCase("Ogrenci")) {
			System.out.println("Aramak istedi�iniz ��renci no girin");
			String arananNo=scan.next();
			for (Ogrenci o : ogrenciList) {
				if (o.getNumara().equalsIgnoreCase(arananNo)) {
					System.out.println("aranan ki�i :" + o.getAdSoyad());
					islemMenusu();
				}
			}
		}
		if (kisiTuru.equalsIgnoreCase("Ogretmen")) {
			System.out.println("Aramak istedi�iniz ogretmen sicil girin");
			String arananNo=scan.next();
			for (Ogretmen o : ogretmenList) {
				if (o.getSicilNo().equalsIgnoreCase(arananNo)) {
					System.out.println("aranan ki�i :" + o.getAdSoyad());
					islemMenusu();
				}
			}
		}
		
	}

	private static void silme() {
		System.out.println("*****Silme sayfas�na Ho�geldiniz*****");
		if (kisiTuru.equalsIgnoreCase("Ogrenci")) {
			System.out.println("Silmek istedi�iniz ��renci no girin");
			String silinecekNo=scan.next();
			for (Ogrenci o : ogrenciList) {
				if (o.getNumara().equalsIgnoreCase(silinecekNo)) {
					System.out.println("silinen ki�i :" + o.getAdSoyad());
					ogrenciList.remove(o);
					islemMenusu();
				}
			}
		}
		if (kisiTuru.equalsIgnoreCase("Ogretmen")) {
			System.out.println("Silmek istedi�iniz ogretmen sicil girin");
			String silinecekNo=scan.next();
			for (Ogretmen o : ogretmenList) {
				if (o.getSicilNo().equalsIgnoreCase(silinecekNo)) {
					System.out.println("silinen ki�i :" + o.getAdSoyad());
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
		System.out.println("*****Ekleme men�s�*****");
		if(kisiTuru.equalsIgnoreCase("Ogrenci")) {
			System.out.println("��renci ad soyad�n� girin");
			String adSoyad=scan.nextLine();
			System.out.println("��renci kimlik no girin");
			String kimlikNo=scan.next();
			System.out.println("��renci ya� girin");
			int ogrenciYas=scan.nextInt();
			System.out.println("��renci Numaras� girin");
			String ogrenciNo=scan.next();
			System.out.println("S�n�f�n� girin");
			String s�n�f=scan.next();
			Ogrenci ogrenci1=new Ogrenci(adSoyad,kimlikNo,ogrenciYas,ogrenciNo,s�n�f);
			
			ogrenciList.add(ogrenci1);
			System.out.println("��renci ba�ar�ylar eklendi");
			islemMenusu();
		}
			if(kisiTuru.equalsIgnoreCase("Ogretmen")) {
				System.out.println("Ogretmen ad soyad�n� girin");
				String adSoyad=scan.nextLine();
				System.out.println("Ogretmen kimlik no girin");
				String kimlikNo=scan.next();
				System.out.println("Ogretmen ya� girin");
				int ogrenciYas=scan.nextInt();
				System.out.println("Sicil no girin");
				String sicilNo=scan.next();
				System.out.println("B�l�m girin");
				String bolum=scan.next();
				Ogretmen ogretmen1=new Ogretmen(adSoyad,kimlikNo,ogrenciYas,sicilNo,bolum);
				
				ogretmenList.add(ogretmen1);
				System.out.println("��retmen ba�ar�ylar eklendi");
				islemMenusu();
			
		}
		scan.close();
    }


}
