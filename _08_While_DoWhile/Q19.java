package _08_While_DoWhile;

import java.util.Scanner;

public class Q19 {

    public static void main(String[] args) {
         /*
        Girilen bir say�ya kadar olan say�lardan sadece tek olanlar�n� ekrana yazd�r�n�z.
         girilen say� dahil
        */
    	Scanner scan=new Scanner(System.in);
		System.out.print("L�tfen bir say� girin:");
		int a= scan.nextInt();
		
		int sayac=1;
		do {
			System.out.print(sayac + " ");
			sayac+=2;
		} while (sayac<a);

		scan.close();
    }
}
