package _08_While_DoWhile;

import java.util.Scanner;

public class Q18_StringPinKontrol {
    public static void main(String[] args) {

        //STRING OLAN PIN kodunuzu kontrol eden ve 3 giris hakki veren bir kod yaz�n�z.

    	Scanner scan=new Scanner(System.in);
				
		String systemPin="1453";
		int girisHakk�=3;
		
		while (true ) {
			System.out.print("pin code giriniz");
			String userPin= scan.nextLine();
			if (userPin.equals(systemPin)) {
				System.out.println("gayet ba�ar�l�");
				break;
			} else {
				System.out.println("Hatal� giri� yap�ld�");
				girisHakk�--;
				System.out.println("kalan deneme hakk�n�z : " + girisHakk�);
			
			
			}
			
			if (girisHakk�==0) {
				System.out.println("Giri� hakk�n�z kalmad�");
				break;
			}
		}
		
		
		
		
		scan.close();

    }


}
