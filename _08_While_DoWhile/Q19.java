package _08_While_DoWhile;

import java.util.Scanner;

public class Q19 {

    public static void main(String[] args) {
         /*
        Girilen bir sayýya kadar olan sayýlardan sadece tek olanlarýný ekrana yazdýrýnýz.
         girilen sayý dahil
        */
    	Scanner scan=new Scanner(System.in);
		System.out.print("Lütfen bir sayý girin:");
		int a= scan.nextInt();
		
		int sayac=1;
		do {
			System.out.print(sayac + " ");
			sayac+=2;
		} while (sayac<a);

		scan.close();
    }
}
