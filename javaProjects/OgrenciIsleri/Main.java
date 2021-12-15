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
			System.out.println("***** OGRENC� ISLER� UYGULAMASI *****");
			System.out.println("Yapmak istedi�iniz i�lemi secin");
			System.out.println("1-->O�renci kay�t\t2-->Ogrenci Listeleme\n3-->Ogrenci Kay�t silme\t4-->C�k�s");
			int secim = scan.nextInt();

			switch (secim) {
			case 1:
				ogrenciKay�t(liste);
				break;
			case 2:
				ogrenciListeleme(liste);
				break;
			case 3:
				ogrenciKay�tSilme(liste);
				break;
			case 4:
				c�k�s();
			default:
				System.out.println("Yanl�� giri� yapt�n�z");
				break;
			}
		} catch (InputMismatchException e) {
			System.out.println("Birle d�rt aras�nda rakam giriniz : ");
			anaMenu(liste);
		}

		scan.close();

	}

	private static void c�k�s() {
		System.out.println("iyi g�nler dileriz");
		
	}

	private static void ogrenciKay�tSilme(List<Ogrenci> liste) {
		Scanner scan=new Scanner(System.in);
		System.out.println("***** ��renci Kay�t Silme Sayfas�na Ho�geldiniz*****");
		System.out.println("Silmek istedi�iniz ��renci no giriniz :");
		int silinecekNo=scan.nextInt();
		
		for (Ogrenci o : liste) {
			if (o.getNo()==silinecekNo) {
				System.out.println("Kayd� silinecek ��renci : "+ o.getAd());
				liste.remove(o);
				anaMenu(liste);
			}
		}
		System.out.println("Girdi�iniz numara bulunmamaktad�r");
		anaMenu(liste);
		
		
		scan.close();
	}

	private static void ogrenciListeleme(List<Ogrenci> liste) {
		for (Ogrenci o : liste) {
			System.out.println(o.toString());
		}
		anaMenu(liste);
	}

	private static void ogrenciKay�t(List<Ogrenci> liste) {
		Scanner scan = new Scanner(System.in);
		System.out.println("**** Ogrenci Kay�t Sayfas�na Ho�geldiniz *****");
		System.out.println("�sim giriniz : ");
		String isim = scan.nextLine();
		System.out.println("Soyisim giriniz : ");
		String soyisim = scan.nextLine();
		System.out.println("Not ortalamas� girin : ");
		double ortalama = scan.nextDouble();
		Ogrenci ogrenci1=new Ogrenci(++numara,isim,soyisim,ortalama);
		liste.add(ogrenci1);
		anaMenu(liste);
		scan.close();
	}

}
