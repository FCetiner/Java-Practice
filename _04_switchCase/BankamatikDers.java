package _04_switchCase;

import java.util.Scanner;

public class BankamatikDers {

	public static void main(String[] args) {
		
		System.out.println("*** ATM'ye ho� geldiniz ***");
		Scanner scan= new Scanner(System.in);
		String islem=" 1.islem : BAKIYE \n 2.islem : PARA CEKME\n 3. islem : PARA YATIRMA \n 4. islem : CIKIS";
		
		System.out.println(islem);
		System.out.print("yapmak istedi�iniz i�lemi se�iniz\n");
		System.out.print("*********************************");
		
		
		int bakiye = 5000;
		
		String secilenIslem=scan.nextLine();
		
		switch (secilenIslem) {
		case "1":
			System.out.println("bakiyeniz : " + bakiye);
			break;
		case "2":
			System.out.println("cekmek istedi�iniz miktar� giriniz");
			int cekilecekMiktar=scan.nextInt();
			if (cekilecekMiktar<=bakiye) {
				bakiye-=cekilecekMiktar;
				System.out.println("yeni bakiyeniz : " + bakiye);
			} else {
				System.out.println("yetersiz bakiye");
			}
			
			break;
		case "3":
			System.out.println("yat�rmak istedi�iniz miktar� giriniz");
			int yat�r�lacakMiktar=scan.nextInt();
			bakiye+=yat�r�lacakMiktar;
			System.out.println("yeni bakiyeniz : " + bakiye);
			
			break;
		case "4":
			System.out.println("c�k�s i�lemi ba�ar� ile yap�ld�");
			break;

		default:
			System.out.println("Hatal� se�im yapt�n�z");
			break;
		}
	scan.close();
	
	}

}
