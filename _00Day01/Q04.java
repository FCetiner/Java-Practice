package _00Day01;

import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		
		//kullan�c�dan 2 tam say� al�p d�rt i�lem sonucunu yazd�r�n�z
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("1. Say�y� giriniz:");
		
		double say�1 = scan.nextInt();
		
		System.out.print("2. Say�y� giriniz:");
		
		double say�2 = scan.nextInt();
		
		System.out.println("girilen say�lar�n toplam�:"+(say�1+say�2));
		System.out.println("girilen say�lar�n fark�:"+(say�1-say�2));
		System.out.println("girilen say�lar�n �arp�m�:"+(say�1*say�2));
		System.out.println("girilen say�lar�n b�l�m�:"+(say�1/say�2));
		
		
		scan.close();
		
		

	}

}
