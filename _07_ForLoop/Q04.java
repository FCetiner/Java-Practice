package _07_ForLoop;

import java.util.Scanner;

public class Q04 {

    public static void main(String[] args) {
        // Kullan�c�dan 5 adet say� isteyiniz
        // Bu say�lardan 5 ile 10 aras�ndakiler hari�, di�erlerinin toplam�n� bulunuz.
        // bu soruyu continue kullanarak ��z�n�z.

    	Scanner scan =new Scanner(System.in);
    	 //s�n�r ve art�� miktar� belli ise for methodu kullan�l�r
        int toplam=0;
    	
    	for (int i = 1; i <= 5; i++) {
			System.out.print("say� " +i + " giriniz:");
			int say�=scan.nextInt();
			if (say�>5 && say�<10) {
				System.out.println("girilen 5 ile 10 aras� oldu�undan i�leme al�nmad�");
			continue;  //ticari bekleme devam et komutudur.
			
			} 
    	toplam+=say�;
    	}
    	
    	System.out.println("girdi�iniz say�lar�n toplam� : "+toplam);
    	
    	scan.close();
    }

}
