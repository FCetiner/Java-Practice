package _08_While_DoWhile;

import java.util.Scanner;

public class Q14_FaktoriyelBulma {

    public static void main(String[] args) {
        /*  Problem Tanýmý
        Verilen bir sayýnýn faktöriyelini özyineli (recursive) olarak
        hespalayan fonksiyonu yazýnýz.

        örnek Ekran çýktýlarý
        Bir sayi giriniz: 6
        Faktöriyeli: 720

        Bir sayý giriniz: 3
        Faktöriyeli 6
     */
    	Scanner scan=new Scanner(System.in);
    	System.out.print("Lütfen bir sayý girin : ");
		int sayi=scan.nextInt();
		int faktoriyel=1;
		
		
		while (sayi>0) {
			faktoriyel *= sayi;
			
			sayi--;
		}
		System.out.println("faktoriyel : " + faktoriyel);
		
		scan.close();
    }
}


