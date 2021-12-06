package _07_ForLoop;

import java.util.Scanner;

public class Q04 {

    public static void main(String[] args) {
        // Kullanýcýdan 5 adet sayý isteyiniz
        // Bu sayýlardan 5 ile 10 arasýndakiler hariç, diðerlerinin toplamýný bulunuz.
        // bu soruyu continue kullanarak çözünüz.

    	Scanner scan =new Scanner(System.in);
    	 //sýnýr ve artýþ miktarý belli ise for methodu kullanýlýr
        int toplam=0;
    	
    	for (int i = 1; i <= 5; i++) {
			System.out.print("sayý " +i + " giriniz:");
			int sayý=scan.nextInt();
			if (sayý>5 && sayý<10) {
				System.out.println("girilen 5 ile 10 arasý olduðundan iþleme alýnmadý");
			continue;  //ticari bekleme devam et komutudur.
			
			} 
    	toplam+=sayý;
    	}
    	
    	System.out.println("girdiðiniz sayýlarýn toplamý : "+toplam);
    	
    	scan.close();
    }

}
