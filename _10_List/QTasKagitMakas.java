package _10_List;

import java.util.Scanner;

public class QTasKagitMakas {
	static int secim1;
	static int secim2;
	static int bilgisayar, kullanýcý;

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
				System.out.println("bilgisayar kazandý");
	
				break;
			case 2:
				System.out.println("kullanýcý kazandý");
				kullanýcý++;
				break;
			}
			break;
		case 1:
			switch (secim2) {
			case 0:
				System.out.println("kullanýcý kazandý");
			
				break;
			case 1:
				System.out.println("berabere");
				break;
			case 2:
				System.out.println("bilgisayar kazandý");
			
				break;
			}
			break;
		case 2:
			switch (secim2) {
			case 0:
				System.out.println("bilgisayar kazandý");
	
				break;
			case 1:
				System.out.println("kullanýcý kazandý");

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

		System.out.println("*****Taþ Kaðýt Makas oyununa hoþgeldiniz*****");
		System.out.println("*****Lütfen seçiminizi yapýn*****");
		secim2 = (int) (Math.random() * 3);
		System.out.println("Kaðýt 0, Taþ 1, Makas 2");
		secim1 = scan.nextInt();
		System.out.println("bilgisayar secimi : " + secim2);

		if (secim1 < 0 || secim1 > 3) {
			System.out.println("Lütfen geçerli bir tercih yapýnýz");
			secim();

		} else {
			oyun();
		}

		scan.close();
	}

}