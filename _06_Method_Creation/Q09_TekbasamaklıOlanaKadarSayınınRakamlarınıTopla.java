package _06_Method_Creation;

import java.util.Scanner;

public class Q09_Tekbasamakl�OlanaKadarSay�n�nRakamlar�n�Topla {
/*
    Problem Tan�m�:
    addDigits isminde bir method olu�turun.
    Parametresi int
    Return tipi de int
    Pozitif int de�erler ver ve en son sonu� tek basamakl� ��kana kadar basamaklar� birbiriyle topla.
    Tek basamakl� ��kt���nda, d�nd�r�n

    �rnek1:
    Girdi 38
    ��kt�: 2
    A��klama: i�lemler ��yle olacak: 3 + 8 = 11, 1 + 1 = 2.
         2 , tek basamakl� oldu�undan, bunu d�nd�r�n.
    */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("bir sayi giriniz : ");
		
		int num=scan.nextInt();
		
		addDigits(num);
		
		
scan.close();
	}

	private static int addDigits(int num) {
		nas�l("kolay gelsin method run ne oluyor");
		
		for (int i = 0; i < 5; i++) {
			num=sum(num);
		
		if (num<10) 
			break;
		}
		return sum(num);
	}

	private static void nas�l(String mesaj) {
		System.out.println("nas�l methodu �al��t�:" + mesaj);
		gozunAyd�n("helal olsun bu metod �al��t� ise devamkee");
		
	}

	private static void gozunAyd�n(String goygoy) {
		System.out.println("gozunAyd�n �al��t�" +goygoy);
		
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