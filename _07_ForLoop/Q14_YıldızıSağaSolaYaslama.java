package _07_ForLoop;

import java.util.Scanner;

public class Q14_YýldýzýSaðaSolaYaslama {
 public static void main(String[] args) {
    /*  Problem Tanýmý
        Girilen bir sayý kadar satýr ve sütünu olan ve
        sað kenara dayalý üçgeni basan kodu yazýnýz.

        Ekran çýktýsý
        Bir sayi giriniz: 5
            *
           **
          ***
         ****
        *****

        */       
         /*
                    *
                    * *
                    * * *
                    * * * *
                    * * * * *
                    þeklini yazdýrýnýz
             */

	 Scanner scan = new Scanner(System.in);
     System.out.print("Lutfen birden büyük bir tamsayi giriniz : ");
     int sayý = scan.nextInt();
     
         
    for (int satýr = 1; satýr <=sayý; satýr++) {
		for (int bosluk = sayý-satýr; bosluk >=1; bosluk--) {
			System.out.print(" ");
		}
	for (int yýldýz = 1; yýldýz < satýr; yýldýz++) {
		System.out.print("*");
	}
    System.out.println();
    }
     
     
     
     
     for (int satýr = 1; satýr <= sayý; satýr++) {
		for (int sutun = 1; sutun <= satýr; sutun++) {
			System.out.print("*");
			
		}
	System.out.println();

     }
	 
	 
	 
	 scan.close();
	 
        
    }
}
