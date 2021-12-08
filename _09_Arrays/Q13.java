package _09_Arrays;

import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		// Kullanicidan aldigimiz 8 elemanli arrayin icinde 
    	// kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
		
		Scanner scan = new Scanner(System.in);
		
		int arr [] = new int [8];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Lütfen 8 elemanlý arrayin elemanlarýný girin:");
			int a=scan.nextInt();
			arr[i]=a;
		}
		int flag=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%3==0) {
				flag++;
			}
		}
		
		System.out.println("Arrayde " + flag + " adet 3' e bölünebilen sayý vardýr.");
	
		scan.close();
	}

}
