package _10_List;

import java.util.ArrayList;
import java.util.List;

public class QAsalSayi {

	/*
	 * 100 den kucuk asal sayilari yazdiran bir program yaziniz
	 */
	public static void main(String[] args) {

		List<Integer> asalList = new ArrayList<>();

		int say� = 3;
		int count = 0;
		asalList.add(1);
		asalList.add(2);

		while (say� < 100) {
			count = 0;
			for (int i = 2; i < say�; i++) {
				if (say� % i == 0) {
					count++;
					break;
				}
			}

			if (count == 0) {
				asalList.add(say�);
			}
			say�++;
		}
		System.out.println(asalList);
	}
}
