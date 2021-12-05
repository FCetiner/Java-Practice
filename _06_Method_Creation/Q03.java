package _06_Method_Creation;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {


// Saati saniyeye, mil'i kilometreye, kilogrami gram'a
        // ceviren bir method yaziniz.
    	Scanner scan = new Scanner(System.in);
        System.out.print("Çevrilecek birimi giriniz");
        String birim=scan.next();
        
        System.out.print("Çevrilecek birimin deðerini giriniz");
        double miktar=scan.nextDouble();
      
        cevir(birim,miktar);  //methodlara isim verirken emir kipi kullanýlýr
  scan.close();  
  }

	private static void cevir(String brm, double mktr) {
		
		switch (brm) {
		case "saat":
		System.out.println("girilen saatin saniye deðeri:"+(mktr*60*60) + " saniye");	
			break;
		case "mil":
			System.out.println("girilen milin km deðeri: " + mktr*1.6 + " km");
			break;
		case "km":
			System.out.println("girilen kg'nin gram deðeri: " + mktr*1000 + " gram");
			break;
		default:
			System.out.println("Geçerli deðer girin");
			break;
		}
	
	}
}

