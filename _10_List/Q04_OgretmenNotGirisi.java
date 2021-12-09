package _10_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q04_OgretmenNotGirisi {
    public static void main(String[] args) {
        // Bir öðretmenden girmek istediði kadar notu alýnýz, ve
        // ortalamayý geçen öðrenci sayýsýný bulunuz.

    	Scanner scan = new Scanner(System.in);
    	List <Integer> listNotlar = new ArrayList<>();
    	String devam = "";
    	//ortalamasý alýnacak list elemanlarý kullanýcýdan alýndý
    	do {
			System.out.println("not giriniz : ");
			int ogrNot=scan.nextInt();
			System.out.println("devam etmek için 'E/H' girin");
			devam=scan.next();
			listNotlar.add(ogrNot);
			
		} while (devam.equalsIgnoreCase("E"));
    	
    	//ortalama hesaplanacak
    	int toplam=0;
    	
    	for (int i = 0; i < listNotlar.size(); i++) {
			toplam+=listNotlar.get(i);
		}
    	double ortalama=toplam/listNotlar.size();
    	
    	
    	//ortalamayý geçen ogrenci sayýsý
    	
    	int ortalamaGecenSayýsý=0;
    	for (int i = 0; i < listNotlar.size(); i++) {
			if (listNotlar.get(i)>ortalama) {
				ortalamaGecenSayýsý++;
			}
		}
    	
    	System.out.println("Girilen notlarýn ortalamasý : " + ortalama);
    	System.out.println("Ortalamayý geçen ogrenci sayýsý : " + ortalamaGecenSayýsý);
    /*	System.out.println("Öðrenci sayýsýný girin : ");
    	int ogrenci = scan.nextInt();
    	List <Integer> notListesi = new ArrayList <> ();
    	
    	for (int i = 0; i < ogrenci; i++) {
			System.out.println("Lütfen notlarý arka arkaya girin : ");
			int notlar = scan.nextInt();
			notListesi.add(notlar);
		}
    	
    	int toplam = 0, ortalama=0, count=0;
    	
    	for (int i = 0; i < notListesi.size(); i++) {
			toplam+=notListesi.get(i);
		}
    	ortalama=(toplam/ogrenci);
    	
    	for (int i = 0; i < notListesi.size(); i++) {
			if (notListesi.get(i)>ortalama) {
				count++;
			}
		}
    	
    	System.out.println("Sýnýf mevcudu : " + ogrenci );
    	System.out.println("Sýnýf ortalamasý : " + ortalama);
    	System.out.println("Ortalamayý geçen öðrenci sayýsý : " + count);*/
    	scan.close();
    
    }
}
