package _10_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q05_TekrakamlıSayılarıAyırma {
	public static void main(String[] args) {
		// Kullanıcıdan alacağınız 6 elemanlı bir dizinin
		// sadece tek elemanlarını ayrı diziye bir metodda atayarak
		// main de yazdırınız.

		Scanner scan = new Scanner(System.in);

		
		int arr[] = new int[6];
		for (int i = 0; i < 6; i++) {
			System.out.println("6 adet sayı girin");
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
