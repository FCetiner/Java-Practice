package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
		 *  dort islemden biri ile isleme koyup sonucun yazdiriniz
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Lütfen iki sayý giriniz");
		double sayý1 = scan.nextDouble();
		double sayý2 = scan.nextDouble();
		System.out.print("toplama için 1 \n çýkarma için 2 \n çarpma için 3 \n bölme için 4 ");
		int iþlem = scan.nextInt();
		
		if (iþlem==1) {
			System.out.println((sayý1+sayý2));
		} else if (iþlem==2) {
			System.out.println((sayý1-sayý2));
		}else if (iþlem==3) {
			System.out.println((sayý1*sayý2));			
		}else if (iþlem==4) {
			System.out.println((sayý1/sayý2));
		} else {
			System.out.println("Hatalý giriþ");
		}
	scan.close();		
	
	}
}
