package _10_List;

import java.util.Scanner;

public class QTasKagitMakas {
	static int secim1;
	static int secim2;
	static int bilgisayar, kullan�c�;

	public static void main(String[] args) {
		// tas >makas
		// makas >kagit
		// kagit >tas

	
			secim();
	
	
	}

	private static void oyun() {
		switch (secim1) {
		case 0:
			switch (secim2) {
			case 0:
				System.out.println("berabere");
				break;
			case 1:
				System.out.println("bilgisayar kazand�");
	
				break;
			case 2:
				System.out.println("kullan�c� kazand�");
				kullan�c�++;
				break;
			}
			break;
		case 1:
			switch (secim2) {
			case 0:
				System.out.println("kullan�c� kazand�");
			
				break;
			case 1:
				System.out.println("berabere");
				break;
			case 2:
				System.out.println("bilgisayar kazand�");
			
				break;
			}
			break;
		case 2:
			switch (secim2) {
			case 0:
				System.out.println("bilgisayar kazand�");
	
				break;
			case 1:
				System.out.println("kullan�c� kazand�");

				break;
			case 2:
				System.out.println("berabere");
				break;
			}
			break;
		}

	}

	private static void secim() {
		Scanner scan = new Scanner(System.in);

		System.out.println("*****Ta� Ka��t Makas oyununa ho�geldiniz*****");
		System.out.println("*****L�tfen se�iminizi yap�n*****");
		secim2 = (int) (Math.random() * 3);
		System.out.println("Ka��t 0, Ta� 1, Makas 2");
		secim1 = scan.nextInt();
		System.out.println("bilgisayar secimi : " + secim2);

		if (secim1 < 0 || secim1 > 3) {
			System.out.println("L�tfen ge�erli bir tercih yap�n�z");
			secim();

		} else {
			oyun();
		}

		scan.close();
	}

}