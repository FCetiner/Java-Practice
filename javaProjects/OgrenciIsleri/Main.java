package javaProjects.OgrenciIsleri;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
	static List<Ogrenci> liste = new ArrayList<>();
	static int numara = 100;

	public static void main(String[] args) {

		anaMenu(liste);

	}

	private static void anaMenu(List<Ogrenci> liste) {
		Scanner scan = new Scanner(System.in);

		try {
			System.out.println("***** OGRENCÝ ISLERÝ UYGULAMASI *****");
			System.out.println("Yapmak istediðiniz iþlemi secin");
			System.out.println("1-->Oðrenci kayýt\t2-->Ogrenci Listeleme\n3-->Ogrenci Kayýt silme\t4-->Cýkýs");
			int secim = scan.nextInt();

			switch (secim) {
			case 1:
				ogrenciKayýt(liste);
				break;
			case 2:
				ogrenciListeleme(liste);
				break;
			case 3:
				ogrenciKayýtSilme(liste);
				break;
			case 4:
				cýkýs();
			default:
				System.out.println("Yanlýþ giriþ yaptýnýz");
				break;
			}
		} catch (InputMismatchException e) {
			System.out.println("Birle dört arasýnda rakam giriniz : ");
			anaMenu(liste);
		}

		scan.close();

	}

	private static void cýkýs() {
		System.out.println("iyi günler dileriz");
		
	}

	private static void ogrenciKayýtSilme(List<Ogrenci> liste) {
		Scanner scan=new Scanner(System.in);
		System.out.println("***** Öðrenci Kayýt Silme Sayfasýna Hoþgeldiniz*****");
		System.out.println("Silmek istediðiniz öðrenci no giriniz :");
		int silinecekNo=scan.nextInt();
		
		for (Ogrenci o : liste) {
			if (o.getNo()==silinecekNo) {
				System.out.println("Kaydý silinecek öðrenci : "+ o.getAd());
				liste.remove(o);
				anaMenu(liste);
			}
		}
		System.out.println("Girdiðiniz numara bulunmamaktadýr");
		anaMenu(liste);
		
		
		scan.close();
	}

	private static void ogrenciListeleme(List<Ogrenci> liste) {
		for (Ogrenci o : liste) {
			System.out.println(o.toString());
		}
		anaMenu(liste);
	}

	private static void ogrenciKayýt(List<Ogrenci> liste) {
		Scanner scan = new Scanner(System.in);
		System.out.println("**** Ogrenci Kayýt Sayfasýna Hoþgeldiniz *****");
		System.out.println("Ýsim giriniz : ");
		String isim = scan.nextLine();
		System.out.println("Soyisim giriniz : ");
		String soyisim = scan.nextLine();
		System.out.println("Not ortalamasý girin : ");
		double ortalama = scan.nextDouble();
		Ogrenci ogrenci1=new Ogrenci(++numara,isim,soyisim,ortalama);
		liste.add(ogrenci1);
		anaMenu(liste);
		scan.close();
	}

}
