package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		// Kullanicidan  yasini ve kilosunu alaliniz
		// 18 yasindan kucuk ise kan bagisi yapamaz
		// 18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		// 18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen ya��n�z� giriniz");
		int ya� = scan.nextInt();
		System.out.println("L�tfen kilonuzu giriniz");
		int kilo = scan.nextInt();
		
		if (ya�<18) {
			System.out.println("Kan ba���� yapamazs�n�z");
		} else if (kilo < 50){
			System.out.println("Kan ba���� yapamaz");
		} else {
			System.out.println("Kan ba���� yapabilir");
		}
		scan.close();
		

	}

}
