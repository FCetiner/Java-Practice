package _08_While_DoWhile;

import java.util.Scanner;

public class Q11 {

    /*
           Girilen pozitif bir sayýnýn tam kare olup olmadýðýný bulunuz,
           tamkare ise true  deðilse false yazdýrýnýz.
            Not: sqrt gibi fonksiyonlarý  kullanmayýn.
            Example 1:
            Input: 16
            Output: true
            Not: bu sayý tamkare çünkü 4*4 = 16
            Example 2:
            Input: 25
            Output: true
            Note: bu sayý tamkare çünkü 5*5=25
            Example 3:
            Input: 14
            Output: false

         */
    public static void main(String[] args) {

    	  Scanner scan = new Scanner(System.in);
          System.out.println("bir sayý giriniz");
          int sayi = scan.nextInt();

          int count = 1;
          boolean a = false;

          while (count  < sayi) {
              if (count * count == sayi) {
                  System.out.println(a = true);
                  ;
              }
              count++;
          }
          if (a == false) System.out.println("false");
          
          
          
          /*Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen pozitif tamsayý girin:");
		int sayý= scan.nextInt();
		
		int bolen=1;
		boolean a=false;
		
		while (bolen<sayý) {
			if (bolen*bolen==sayý) {
				System.out.println(a=true);
				
			} 		
		bolen++;
		}
		System.out.println(a);*/
		
		scan.close();

    }
}
