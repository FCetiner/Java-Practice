package javaProjects.kitapYonetimi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
	1.	Kullan�c�n�n Kitap ekleme, silme ve listeleme gibi
		i�lemleri yapmas�na imkan tan�yan bir uygulama yaz�n�z.

	2.	Program, kitaplara 1001’den ba�layarak s�ral� ve otomatik numara vermeli.
		Bunun yan�nda, her bir kitap i�in Kitap Ad�, Yazar Ad�, Yay�n Y�l� ve Fiyat gibi bilgiler girilebilmelidir.

	3.	Program�n ba�lang�c�nda Kullan�c�ya a�a��daki gibi bir men� sunulmal�d�r.
		Kullan�c� program� bitirene kadar i�lemlere devam edebilmelidir.

		========= K�TAP PROGRAMI =============
			1: Kitap ekle
			2: Numara ile kitap sil
			3: T�m kitaplar� listele
			4: Bitir

 */
public class Kitapci {
	static List<Kitap> kitapListe = new ArrayList<>();
	static Scanner scan = new Scanner(System.in);
	static int kitapNo = 1000;

	public static void main(String[] args) {
		
		KitapMetot.kitaplarEkle(kitapListe);
		KitapMetot.menu(kitapListe); //Menu metodu static oldugu i�in dogrudan class ismi olan KitapMetot kulland�k
		
		

	}

//	public static void menu(List<Kitap> liste) {
//		System.out.println("========= K�TAP PROGRAMI =============\n1: Kitap ekle\n2: Numara ile kitap sil\n"
//				+ "3: Tum kitaplari listele\n4: Bitir");
//		System.out.println("��leminizi se�iniz :");
//		int tercih = scan.nextInt();
//		switch (tercih) {
//		case 1:
//			kitapEkle(liste);
//			break;
//		case 2:
//			noIleSil(liste);
//			break;
//		case 3:
//			listele(liste);
//			break;
//		case 4:
//			bitir();
//			break;
//
//		default:
//			System.out.println("Yanl�� giri� yap�ld�.Tekrar deneyiniz");
//			break;
//		}
//	}
//
//	private static void listele(List<Kitap> liste) {
//		for (Kitap k : liste) {
//			System.out.println(k.toString());
//		}
//		menu(liste);
//		
//	}
//
//	private static void noIleSil(List<Kitap> liste) {
//		System.out.println("Silmek istedi�iniz kitap no giriniz : ");
//		int silinecekNo=scan.nextInt();
//		for (Kitap k : liste) {
//			if (k.getNo()==silinecekNo) {
//				liste.remove(k);
//				
//				menu(liste);	//Tekrar men�ye d�n, recursive metot dur
//			}
//		}
//		System.out.println(silinecekNo+" ait kitap bulunamad�");
//		menu(liste);
//	}
//
//	private static void kitapEkle(List<Kitap> liste) {
//		System.out.println("Kitap ismi giriniz : ");
//		scan.nextLine(); //dummy bo� scan objesi
//		String kitapAdi=scan.nextLine();
//	
//		System.out.println("Kitabin yazar ismi giriniz : ");
//		
//		String yazarAdi=scan.nextLine();
//		System.out.println("Yay�n y�l�n� giriniz : ");
//		int yay�nY�l�=scan.nextInt();
//		System.out.println("Kitap fiyat�n� giriniz : ");
//		double fiyat=scan.nextDouble();
//		Kitap kitap=new Kitap(++kitapNo,kitapAdi,yazarAdi,yay�nY�l�, fiyat);//Kitap objesi create edildi
//		liste.add(kitap);
//		System.out.println(kitap.toString()+" eklendi");//Kitap objesinin fiealdlerini Kitap class�nda Source'dan create toString metodu olu�turduk
//	//kitap ad� ve di�er fieldler private oldugu i�in kitap objesini yazd�ramad�k ve bu y�ntemi kulland�k
//	//toString metodu tekrar �al��
//		menu(liste);
//	}
//
//	private static void bitir() {
//		System.out.println("Yine bekleriz");
//		
//	}

}
