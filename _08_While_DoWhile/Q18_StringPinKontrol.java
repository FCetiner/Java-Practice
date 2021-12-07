package _08_While_DoWhile;

import java.util.Scanner;

public class Q18_StringPinKontrol {
    public static void main(String[] args) {

        //STRING OLAN PIN kodunuzu kontrol eden ve 3 giris hakki veren bir kod yazýnýz.

    	Scanner scan=new Scanner(System.in);
				
		String systemPin="1453";
		int girisHakký=3;
		
		while (true ) {
			System.out.print("pin code giriniz");
			String userPin= scan.nextLine();
			if (userPin.equals(systemPin)) {
				System.out.println("gayet baþarýlý");
				break;
			} else {
				System.out.println("Hatalý giriþ yapýldý");
				girisHakký--;
				System.out.println("kalan deneme hakkýnýz : " + girisHakký);
			
			
			}
			
			if (girisHakký==0) {
				System.out.println("Giriþ hakkýnýz kalmadý");
				break;
			}
		}
		
		
		
		
		scan.close();

    }


}
