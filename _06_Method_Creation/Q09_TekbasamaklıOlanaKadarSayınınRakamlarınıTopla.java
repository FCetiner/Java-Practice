package _06_Method_Creation;

import java.util.Scanner;

public class Q09_TekbasamaklýOlanaKadarSayýnýnRakamlarýnýTopla {
/*
    Problem Tanýmý:
    addDigits isminde bir method oluþturun.
    Parametresi int
    Return tipi de int
    Pozitif int deðerler ver ve en son sonuç tek basamaklý çýkana kadar basamaklarý birbiriyle topla.
    Tek basamaklý çýktýðýnda, dündürün

    örnek1:
    Girdi 38
    Çýktý: 2
    Açýklama: iþlemler þöyle olacak: 3 + 8 = 11, 1 + 1 = 2.
         2 , tek basamaklý olduðundan, bunu döndürün.
    */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("bir sayi giriniz : ");
		
		int num=scan.nextInt();
		
		addDigits(num);
		
		
scan.close();
	}

	private static int addDigits(int num) {
		nasýl("kolay gelsin method run ne oluyor");
		
		for (int i = 0; i < 5; i++) {
			num=sum(num);
		
		if (num<10) 
			break;
		}
		return sum(num);
	}

	private static void nasýl(String mesaj) {
		System.out.println("nasýl methodu çalýþtý:" + mesaj);
		gozunAydýn("helal olsun bu metod çalýþtý ise devamkee");
		
	}

	private static void gozunAydýn(String goygoy) {
		System.out.println("gozunAydýn çalýþtý" +goygoy);
		
	}

	private static int sum(int num) {

		
		int toplam =0;
		int rakam =0;
	
		
		while (num>0) {
			
			rakam = num%10;
			toplam+=rakam;
			num/=10;
		}
		System.out.println("Girdiginiz sayinin rakamlar toplami: "+toplam);
			
		return toplam;
	}
}