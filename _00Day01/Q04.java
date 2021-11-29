package _00Day01;

import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		
		//kullanýcýdan 2 tam sayý alýp dört iþlem sonucunu yazdýrýnýz
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("1. Sayýyý giriniz:");
		
		double sayý1 = scan.nextInt();
		
		System.out.print("2. Sayýyý giriniz:");
		
		double sayý2 = scan.nextInt();
		
		System.out.println("girilen sayýlarýn toplamý:"+(sayý1+sayý2));
		System.out.println("girilen sayýlarýn farký:"+(sayý1-sayý2));
		System.out.println("girilen sayýlarýn çarpýmý:"+(sayý1*sayý2));
		System.out.println("girilen sayýlarýn bölümü:"+(sayý1/sayý2));
		
		
		scan.close();
		
		

	}

}
