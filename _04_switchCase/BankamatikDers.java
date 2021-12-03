package _04_switchCase;

import java.util.Scanner;

public class BankamatikDers {

	public static void main(String[] args) {
		
		System.out.println("*** ATM'ye hoþ geldiniz ***");
		Scanner scan= new Scanner(System.in);
		String islem=" 1.islem : BAKIYE \n 2.islem : PARA CEKME\n 3. islem : PARA YATIRMA \n 4. islem : CIKIS";
		
		System.out.println(islem);
		System.out.print("yapmak istediðiniz iþlemi seçiniz\n");
		System.out.print("*********************************");
		
		
		int bakiye = 5000;
		
		String secilenIslem=scan.nextLine();
		
		switch (secilenIslem) {
		case "1":
			System.out.println("bakiyeniz : " + bakiye);
			break;
		case "2":
			System.out.println("cekmek istediðiniz miktarý giriniz");
			int cekilecekMiktar=scan.nextInt();
			if (cekilecekMiktar<=bakiye) {
				bakiye-=cekilecekMiktar;
				System.out.println("yeni bakiyeniz : " + bakiye);
			} else {
				System.out.println("yetersiz bakiye");
			}
			
			break;
		case "3":
			System.out.println("yatýrmak istediðiniz miktarý giriniz");
			int yatýrýlacakMiktar=scan.nextInt();
			bakiye+=yatýrýlacakMiktar;
			System.out.println("yeni bakiyeniz : " + bakiye);
			
			break;
		case "4":
			System.out.println("cýkýs iþlemi baþarý ile yapýldý");
			break;

		default:
			System.out.println("Hatalý seçim yaptýnýz");
			break;
		}
	scan.close();
	
	}

}
