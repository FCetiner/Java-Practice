package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
		 *  dort islemden biri ile isleme koyup sonucun yazdiriniz
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("L�tfen iki say� giriniz");
		double say�1 = scan.nextDouble();
		double say�2 = scan.nextDouble();
		System.out.print("toplama i�in 1 \n ��karma i�in 2 \n �arpma i�in 3 \n b�lme i�in 4 ");
		int i�lem = scan.nextInt();
		
		if (i�lem==1) {
			System.out.println((say�1+say�2));
		} else if (i�lem==2) {
			System.out.println((say�1-say�2));
		}else if (i�lem==3) {
			System.out.println((say�1*say�2));			
		}else if (i�lem==4) {
			System.out.println((say�1/say�2));
		} else {
			System.out.println("Hatal� giri�");
		}
	scan.close();		
	
	}
}
