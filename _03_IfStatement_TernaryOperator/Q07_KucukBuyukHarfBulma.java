package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q07_KucukBuyukHarfBulma {

	public static void main(String[] args) {
		/*
		 * Kullanicidan 1 harf (karakter) aliniz ve bunun buyuk harf, kucuk harf yada 
		hatali giris seklinde kod yazniz
		 */
		 
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Lutfen bir karekter giriniz");
        
        char karakter=scan.next().charAt(0);
        
        if ((karakter>='A' && karakter<='Z') ) {
			System.out.println("girdiğiniz :" + karakter + "büyük bir harftir");
		} else if((karakter>='a' && karakter<='z')){
		System.out.println("girdiğiniz :" + karakter + " küçük bir harftir");
		} else {
			System.out.println("Hatalı giriş");
		}
        
        
        scan.close();
		
		

	}

}
