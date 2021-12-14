package javaProjects.kitapYonetimi;

import java.util.List;
import java.util.Scanner;

public class KitapMetot {
	static Scanner scan = new Scanner(System.in);
	static int kitapNo = 1000;
	public static void menu(List<Kitap> liste) {
		System.out.println("========= K�TAP PROGRAMI =============\n1: Kitap ekle\n2: Numara ile kitap sil\n"
				+ "3: Tum kitaplari listele\n4: Bitir");
		System.out.println("��leminizi se�iniz :");
		int tercih = scan.nextInt();
		switch (tercih) {
		case 1:
			kitapEkle(liste);
			break;
		case 2:
			noIleSil(liste);
			break;
		case 3:
			listele(liste);
			break;
		case 4:
			bitir();
			break;

		default:
			System.out.println("Yanl�� giri� yap�ld�.Tekrar deneyiniz");
			break;
		}
	}

	public static void listele(List<Kitap> liste) {
		for (Kitap k : liste) {
			System.out.println(k.toString());
		}
		menu(liste);
		
	}

	public static void noIleSil(List<Kitap> liste) {
		System.out.println("Silmek istedi�iniz kitap no giriniz : ");
		int silinecekNo=scan.nextInt();
		for (Kitap k : liste) {
			if (k.getNo()==silinecekNo) {
				liste.remove(k);
				
				menu(liste);	//Tekrar men�ye d�n, recursive metot dur
			}
		}
		System.out.println(silinecekNo+" ait kitap bulunamad�");
		menu(liste);
	}

	public static void kitapEkle(List<Kitap> liste) {
		System.out.println("Kitap ismi giriniz : ");
		scan.nextLine(); //dummy bo� scan objesi
		String kitapAdi=scan.nextLine();
	
		System.out.println("Kitabin yazar ismi giriniz : ");
		
		String yazarAdi=scan.nextLine();
		System.out.println("Yay�n y�l�n� giriniz : ");
		int yay�nY�l�=scan.nextInt();
		System.out.println("Kitap fiyat�n� giriniz : ");
		double fiyat=scan.nextDouble();
		Kitap kitap=new Kitap(++kitapNo,kitapAdi,yazarAdi,yay�nY�l�, fiyat);//Kitap objesi create edildi
		liste.add(kitap);
		System.out.println(kitap.toString()+" eklendi");//Kitap objesinin fiealdlerini Kitap class�nda Source'dan create toString metodu olu�turduk
	//kitap ad� ve di�er fieldler private oldugu i�in kitap objesini yazd�ramad�k ve bu y�ntemi kulland�k
	//toString metodu tekrar �al��
		menu(liste);
	}

	public static void bitir() {
		System.out.println("Yine bekleriz");
		
	}
	
	public static void kitaplarEkle(List<Kitap>liste) {
		Kitap kitap1=new Kitap(++kitapNo,"sefiller","Victor Hugo",1980,100);
		Kitap kitap2=new Kitap(++kitapNo,"leyli mecnun","Adnan",1955,150);
		Kitap kitap3=new Kitap(++kitapNo,"toprak ana","Ferhat",1900,100);
		Kitap kitap4=new Kitap(++kitapNo,"kavgam","Kudret nar�",2020,15);
		Kitap kitap5=new Kitap(++kitapNo,"y�ld�zl� geceler","Arnold",1980,300);
	
	liste.add(kitap1);
	liste.add(kitap2);
	liste.add(kitap3);
	liste.add(kitap4);
	liste.add(kitap5);
	
	}

}
