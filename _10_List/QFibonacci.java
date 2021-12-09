package _10_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QFibonacci {
	/*
	 * Kullan�c�dan al�nan bir tamsay�ya kadar FIBONACCI dizisi olu�turun.
	 * 1-1-2-3-5-8-13-21-34....
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir tam say� giriniz : ");
		int a = scan.nextInt();
		List<Integer> fibo = new ArrayList<>();

		fibo.add(1);
		fibo.add(1);

		for (int i = 2; i < a; i++) {
			fibo.add(fibo.get(i - 2) + fibo.get(i - 1));
		}

		System.out.println(fibo);

		scan.close();
	}
}
