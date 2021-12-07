package _08_While_DoWhile;

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {

        // --------GiRiLEN SAYININ BASAMAKLARINDAKi RAKAMLARIN TOPLAMINI BULUNUZ.

    	Scanner scan=new Scanner(System.in);
		System.out.print("Bir sayý girin:");
		int a= scan.nextInt();
		
		int toplam=0;
		
		while (a>0) {
		toplam+=a%10;
		
		a/=10;
				
		}
		System.out.println("GiRiLEN SAYININ BASAMAKLARINDAKi RAKAMLARIN TOPLAMI : " +toplam);
    
		
		scan.close();
    }

}
