package _08_While_DoWhile;

import java.util.Scanner;

public class Q06 {
	static int bolum=0;

	public static void main(String[] args) {
		// kullanicidan bolunen ve bolen seklinde 2 sayi alalim ve bolme operatoru 
		//kullanmadan bolme islemini gerceklestirip bolumu hesaplayan method create ediniz.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir bölünecek sayıyı ve bölen sayıyı giriniz");
		int bolunen = scan.nextInt();
		int bolen=scan.nextInt();
		
		System.out.println("sonuc " + bol(bolunen,bolen));
		
		scan.close();
	}

	private static int bol(int bolunen , int bolen) {
		
		
		do {
			bolunen-=bolen;
			bolum++;
		} while (bolunen>=bolen);
	
		return bolum;
		
		
	}

}


