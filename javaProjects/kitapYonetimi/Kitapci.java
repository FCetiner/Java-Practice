package javaProjects.kitapYonetimi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
	1.	Kullanýcýnýn Kitap ekleme, silme ve listeleme gibi
		iþlemleri yapmasýna imkan tanýyan bir uygulama yazýnýz.

	2.	Program, kitaplara 1001â€™den baþlayarak sýralý ve otomatik numara vermeli.
		Bunun yanýnda, her bir kitap için Kitap Adý, Yazar Adý, Yayýn Yýlý ve Fiyat gibi bilgiler girilebilmelidir.

	3.	Programýn baþlangýcýnda Kullanýcýya aþaðýdaki gibi bir menü sunulmalýdýr.
		Kullanýcý programý bitirene kadar iþlemlere devam edebilmelidir.

		========= KÝTAP PROGRAMI =============
			1: Kitap ekle
			2: Numara ile kitap sil
			3: Tüm kitaplarý listele
			4: Bitir

 */
public class Kitapci {
	static List<Kitap> kitapListe = new ArrayList<>();
	static Scanner scan = new Scanner(System.in);
	static int kitapNo = 1000;

	public static void main(String[] args) {
		
		KitapMetot.kitaplarEkle(kitapListe);
		KitapMetot.menu(kitapListe); //Menu metodu static oldugu için dogrudan class ismi olan KitapMetot kullandýk
		
		

	}

//	public static void menu(List<Kitap> liste) {
//		System.out.println("========= KÝTAP PROGRAMI =============\n1: Kitap ekle\n2: Numara ile kitap sil\n"
//				+ "3: Tum kitaplari listele\n4: Bitir");
//		System.out.println("Ýþleminizi seçiniz :");
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
//			System.out.println("Yanlýþ giriþ yapýldý.Tekrar deneyiniz");
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
//		System.out.println("Silmek istediðiniz kitap no giriniz : ");
//		int silinecekNo=scan.nextInt();
//		for (Kitap k : liste) {
//			if (k.getNo()==silinecekNo) {
//				liste.remove(k);
//				
//				menu(liste);	//Tekrar menüye dön, recursive metot dur
//			}
//		}
//		System.out.println(silinecekNo+" ait kitap bulunamadý");
//		menu(liste);
//	}
//
//	private static void kitapEkle(List<Kitap> liste) {
//		System.out.println("Kitap ismi giriniz : ");
//		scan.nextLine(); //dummy boþ scan objesi
//		String kitapAdi=scan.nextLine();
//	
//		System.out.println("Kitabin yazar ismi giriniz : ");
//		
//		String yazarAdi=scan.nextLine();
//		System.out.println("Yayýn yýlýný giriniz : ");
//		int yayýnYýlý=scan.nextInt();
//		System.out.println("Kitap fiyatýný giriniz : ");
//		double fiyat=scan.nextDouble();
//		Kitap kitap=new Kitap(++kitapNo,kitapAdi,yazarAdi,yayýnYýlý, fiyat);//Kitap objesi create edildi
//		liste.add(kitap);
//		System.out.println(kitap.toString()+" eklendi");//Kitap objesinin fiealdlerini Kitap classýnda Source'dan create toString metodu oluþturduk
//	//kitap adý ve diðer fieldler private oldugu için kitap objesini yazdýramadýk ve bu yöntemi kullandýk
//	//toString metodu tekrar çalýþ
//		menu(liste);
//	}
//
//	private static void bitir() {
//		System.out.println("Yine bekleriz");
//		
//	}

}
