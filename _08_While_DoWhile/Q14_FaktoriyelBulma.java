package _08_While_DoWhile;

import java.util.Scanner;

public class Q14_FaktoriyelBulma {

    public static void main(String[] args) {
        /*  Problem Tan�m�
        Verilen bir say�n�n fakt�riyelini �zyineli (recursive) olarak
        hespalayan fonksiyonu yaz�n�z.

        �rnek Ekran ��kt�lar�
        Bir sayi giriniz: 6
        Fakt�riyeli: 720

        Bir say� giriniz: 3
        Fakt�riyeli 6
     */
    	Scanner scan=new Scanner(System.in);
    	System.out.print("L�tfen bir say� girin : ");
		int sayi=scan.nextInt();
		int faktoriyel=1;
		
		
		while (sayi>0) {
			faktoriyel *= sayi;
			
			sayi--;
		}
		System.out.println("faktoriyel : " + faktoriyel);
		
		scan.close();
    }
}


