package _07_ForLoop;

import java.util.Scanner;

public class Q14_Y�ld�z�Sa�aSolaYaslama {
 public static void main(String[] args) {
    /*  Problem Tan�m�
        Girilen bir say� kadar sat�r ve s�t�nu olan ve
        sa� kenara dayal� ��geni basan kodu yaz�n�z.

        Ekran ��kt�s�
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
                    �eklini yazd�r�n�z
             */

	 Scanner scan = new Scanner(System.in);
     System.out.print("Lutfen birden b�y�k bir tamsayi giriniz : ");
     int say� = scan.nextInt();
     
         
    for (int sat�r = 1; sat�r <=say�; sat�r++) {
		for (int bosluk = say�-sat�r; bosluk >=1; bosluk--) {
			System.out.print(" ");
		}
	for (int y�ld�z = 1; y�ld�z < sat�r; y�ld�z++) {
		System.out.print("*");
	}
    System.out.println();
    }
     
     
     
     
     for (int sat�r = 1; sat�r <= say�; sat�r++) {
		for (int sutun = 1; sutun <= sat�r; sutun++) {
			System.out.print("*");
			
		}
	System.out.println();

     }
	 
	 
	 
	 scan.close();
	 
        
    }
}
