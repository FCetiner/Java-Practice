package _10_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q05_Tekrakaml�Say�lar�Ay�rma {
	public static void main(String[] args) {
		// Kullan�c�dan alaca��n�z 6 elemanl� bir dizinin
		// sadece tek elemanlar�n� ayr� diziye bir metodda atayarak
		// main de yazd�r�n�z.

		Scanner scan = new Scanner(System.in);

		
		int arr[] = new int[6];
		for (int i = 0; i < 6; i++) {
			System.out.println("6 adet say� girin");
			int a = scan.nextInt();
			arr[i] = a;
		}

		System.out.println(sadeceTekler(arr));

		scan.close();
	}

	private static List<Integer> sadeceTekler(int[] arr) {
		List<Integer> tekDizi = new ArrayList<>();
		int j = 0;
		while (j < 6) {
			if (arr[j] % 2 != 0) {
				tekDizi.add(arr[j]);
			}
			j++;
		}
		return tekDizi;
		
	}

}
