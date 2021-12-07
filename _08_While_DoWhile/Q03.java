package _08_While_DoWhile;

import java.util.Scanner;

public class Q03 {

    public static void main(String[] args) {
        // Kullanicidan 2 sayi alaliniz.
        //1. sayi taban
        //2. sayi Ust
        //1 sayinin ussunu hesaplatan code create edinim.
        // 3, 3  sonuc = 27

        //2  3 = 2*2*2=8

    	Scanner scan=new Scanner(System.in);
		System.out.print("Arka arkaya iki sayý girin:");
		int a= scan.nextInt();
		int b= scan.nextInt();
		
		int us=1;
		int c=b;
		do {
			us*=a;
			
		c--;
			
		} while (c>0);
		
		System.out.println("Girdiðini sayý " + a + " 'nýn " + b + " üssü : " + us );
  
    
    scan.close();
    }


}
