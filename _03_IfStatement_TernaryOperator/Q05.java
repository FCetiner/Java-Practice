package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		// Kullanicidan  yasini ve kilosunu alaliniz
		// 18 yasindan kucuk ise kan bagisi yapamaz
		// 18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		// 18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen yaþýnýzý giriniz");
		int yaþ = scan.nextInt();
		System.out.println("Lütfen kilonuzu giriniz");
		int kilo = scan.nextInt();
		
		if (yaþ<18) {
			System.out.println("Kan baðýþý yapamazsýnýz");
		} else if (kilo < 50){
			System.out.println("Kan baðýþý yapamaz");
		} else {
			System.out.println("Kan baðýþý yapabilir");
		}
		scan.close();
		

	}

}
