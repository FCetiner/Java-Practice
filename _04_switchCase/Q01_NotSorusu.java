package _04_switchCase;

import java.util.Scanner;

public class Q01_NotSorusu {

	public static void main(String[] args) {
		// Kullan�c�dan notunu al�n ve a�a��daki kurallara g�re ekrana A, B, C veya D yazd�r�n.
		// 1. 0()dahil ile 50 arasi - D   
		// 2. 50(dahil) ile 60 aras� - C   
		// 3. 60(dahil) ile 80 aras� - B  
		// 4. 80(dahil) ustu- A
		// Yanlis not girilirse ekrana "Gecerli not giriniz" yazdirin
		// switch() kullanarak yapiniz.
		
		// switch() de long kullanilmaz, float kullanilmaz, double kullanilmaz, boolean kullanilmaz.
		// switch() de int, byte, short, char, String kullanilir.
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Notunuzu giriniz:");
		int not = scan.nextInt();
		
		
		
		switch (not/10) {
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("Notunuz: D");
			break;
		case 5:
			System.out.println("Notunuz: C");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("Notunuz: B");
			break;
		case 9:
		case 10:
			System.out.println("Notunuz: A");
			break;
		default:
			System.out.println("Ge�erli bir not giriniz");
			break;
		}
		
scan.close();

	
	}
}
