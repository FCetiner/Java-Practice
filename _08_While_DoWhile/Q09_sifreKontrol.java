package _08_While_DoWhile;

import java.util.Scanner;

public class Q09_sifreKontrol {
static int num=1453;
    public static void main(String[] args) {
//  kullanicinin INTEGER OLAN PIN kodunuzu kontrol eden bir kod yaz�n�z.

    	Scanner scan=new Scanner(System.in);
		System.out.print("pin code giriniz");
		int pin= scan.nextInt();
		
					
		 while (pin!=num) {
    		System.out.println("****  hatal� giri� yap�ld�    *****");
    		System.out.println("****  tekrar deneyiniz    *****");
    		pin=scan.nextInt();				//Kullan�c�dan yeni pin istiyor
		}
    	System.out.println("ba�ar�l� giri� yapt�n�z");
   
    scan.close();
    }
}

