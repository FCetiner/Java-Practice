package _07_ForLoop;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {

    /*  Kullanýcýdan 1'den büyük bir tam sayý girmesini isteyin
         ve 1'den girilen tam sayýya kadar olan sayýlarýn karelerinin toplamýný
         hesaplayan kodu yazýnýz.

         örnek Ekran çýktýsý
        Girilen sayý=4
        Kareler toplamý=30
     */
    	Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen birden büyük bir tamsayi giriniz : ");
        int sayý = scan.nextInt();
        
       int karelerToplamý=0;
        
        for (int i = 1; i <= sayý; i++) {
			karelerToplamý+=i*i;
		}
        System.out.println(sayý+ " ' a kadar olan sayýlarýn kareleri toplamý :  " +karelerToplamý);
    
    scan.close();
    }
}
