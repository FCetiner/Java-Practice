package _07_ForLoop;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {

    /*  Kullan�c�dan 1'den b�y�k bir tam say� girmesini isteyin
         ve 1'den girilen tam say�ya kadar olan say�lar�n karelerinin toplam�n�
         hesaplayan kodu yaz�n�z.

         �rnek Ekran ��kt�s�
        Girilen say�=4
        Kareler toplam�=30
     */
    	Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen birden b�y�k bir tamsayi giriniz : ");
        int say� = scan.nextInt();
        
       int karelerToplam�=0;
        
        for (int i = 1; i <= say�; i++) {
			karelerToplam�+=i*i;
		}
        System.out.println(say�+ " ' a kadar olan say�lar�n kareleri toplam� :  " +karelerToplam�);
    
    scan.close();
    }
}
