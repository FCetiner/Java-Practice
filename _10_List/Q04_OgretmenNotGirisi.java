package _10_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q04_OgretmenNotGirisi {
    public static void main(String[] args) {
        // Bir ��retmenden girmek istedi�i kadar notu al�n�z, ve
        // ortalamay� ge�en ��renci say�s�n� bulunuz.

    	Scanner scan = new Scanner(System.in);
    	List <Integer> listNotlar = new ArrayList<>();
    	String devam = "";
    	//ortalamas� al�nacak list elemanlar� kullan�c�dan al�nd�
    	do {
			System.out.println("not giriniz : ");
			int ogrNot=scan.nextInt();
			System.out.println("devam etmek i�in 'E/H' girin");
			devam=scan.next();
			listNotlar.add(ogrNot);
			
		} while (devam.equalsIgnoreCase("E"));
    	
    	//ortalama hesaplanacak
    	int toplam=0;
    	
    	for (int i = 0; i < listNotlar.size(); i++) {
			toplam+=listNotlar.get(i);
		}
    	double ortalama=toplam/listNotlar.size();
    	
    	
    	//ortalamay� ge�en ogrenci say�s�
    	
    	int ortalamaGecenSay�s�=0;
    	for (int i = 0; i < listNotlar.size(); i++) {
			if (listNotlar.get(i)>ortalama) {
				ortalamaGecenSay�s�++;
			}
		}
    	
    	System.out.println("Girilen notlar�n ortalamas� : " + ortalama);
    	System.out.println("Ortalamay� ge�en ogrenci say�s� : " + ortalamaGecenSay�s�);
    /*	System.out.println("��renci say�s�n� girin : ");
    	int ogrenci = scan.nextInt();
    	List <Integer> notListesi = new ArrayList <> ();
    	
    	for (int i = 0; i < ogrenci; i++) {
			System.out.println("L�tfen notlar� arka arkaya girin : ");
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
    	
    	System.out.println("S�n�f mevcudu : " + ogrenci );
    	System.out.println("S�n�f ortalamas� : " + ortalama);
    	System.out.println("Ortalamay� ge�en ��renci say�s� : " + count);*/
    	scan.close();
    
    }
}
