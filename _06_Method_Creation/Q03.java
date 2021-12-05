package _06_Method_Creation;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {


// Saati saniyeye, mil'i kilometreye, kilogrami gram'a
        // ceviren bir method yaziniz.
    	Scanner scan = new Scanner(System.in);
        System.out.print("�evrilecek birimi giriniz");
        String birim=scan.next();
        
        System.out.print("�evrilecek birimin de�erini giriniz");
        double miktar=scan.nextDouble();
      
        cevir(birim,miktar);  //methodlara isim verirken emir kipi kullan�l�r
  scan.close();  
  }

	private static void cevir(String brm, double mktr) {
		
		switch (brm) {
		case "saat":
		System.out.println("girilen saatin saniye de�eri:"+(mktr*60*60) + " saniye");	
			break;
		case "mil":
			System.out.println("girilen milin km de�eri: " + mktr*1.6 + " km");
			break;
		case "km":
			System.out.println("girilen kg'nin gram de�eri: " + mktr*1000 + " gram");
			break;
		default:
			System.out.println("Ge�erli de�er girin");
			break;
		}
	
	}
}

