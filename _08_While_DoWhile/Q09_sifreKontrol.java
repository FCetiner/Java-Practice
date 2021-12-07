package _08_While_DoWhile;

import java.util.Scanner;

public class Q09_sifreKontrol {
static int num=1453;
    public static void main(String[] args) {
//  kullanicinin INTEGER OLAN PIN kodunuzu kontrol eden bir kod yazýnýz.

    	Scanner scan=new Scanner(System.in);
		System.out.print("pin code giriniz");
		int pin= scan.nextInt();
		
					
		 while (pin!=num) {
    		System.out.println("****  hatalý giriþ yapýldý    *****");
    		System.out.println("****  tekrar deneyiniz    *****");
    		pin=scan.nextInt();				//Kullanýcýdan yeni pin istiyor
		}
    	System.out.println("baþarýlý giriþ yaptýnýz");
   
    scan.close();
    }
}

