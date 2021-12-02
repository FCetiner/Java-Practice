package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
	/*
	 *  Kullanicidan 3 tene pozitif  tam sayi alniz. 
	 *  bu uc sayinin ucgen olusturma durumunu kontrol ediniz
	    eger ucgen olabiliyor ise, es kenar ucgen olma durumunu da  kontrol edniz
	     
	     Ã¼Ã§gen olma sarti :herhangi iki kenar toplami diger kenardan bÃ¼yÃ¼k, herhangi iki kenar farkÄ± diger kenardan bÃ¼yÃ¼k olmali
		 a+b>c>a-b
		 a+c>b>a-c  
	     b+c>a>b-c  
		a=b=c ise es kenar ucgen 
		 
	 */
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Üç pozitif tam sayý giriniz:");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		if ((a+b>c & c<a-b) || (a+c>b & b>a-c) || (b+c>a || a>b-c)) {
			
			if ((a==b) & (b==c)) {
			System.out.println("eþkenar üçgen");
		} else {
			System.out.println("eþkenar deðil");}
		} else {
			System.out.println("Üçgen deðil");
		}
	scan.close();
	}

}
