package _04_switchCase;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {

// Girilen bir ay numarasýna göre , ayýn kaç gün olduÄŸunu sayý ile yazdýrýnýz

    	Scanner scan = new Scanner(System.in);
    	System.out.print("Lütfen bir ay numarasý girin:");
    	int ay = scan.nextInt();  	
    	
    	switch (ay) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("girdiðiniz ay 31 gün");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("girdiðiniz ay 30 gün");
			break;
		case 2:
			System.out.print("yýlý giriniz : ");
			int yýl = scan.nextInt();
			if (yýl%4==0) {
				System.out.println("girdiðiniz ay 29 gün");
			} else {
				System.out.println("girdiðiniz ay 28 gün");
			}
			break;
		
		default:
			System.out.println("Geçerli bir rakam giriniz");
			break;
		}
       scan.close();
    }
}

