package _04_switchCase;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {

        // Bugüne göre 100 gün sonra hangi gün olduğunuz yazdırınız.
        // pazartesi haftanin ilk gunu olarak aliniz..
        
    	Scanner scan = new Scanner(System.in);
    	System.out.println("G�n numaras� giriniz:");
    	int  g�n = scan.nextInt();
    	int kalan = 100%7;
    	
    	switch (g�n+kalan) {
		case 1:
			System.out.println("Y�z g�n sonras�: Pazartesi");
			break;
		case 2:
			System.out.println("Y�z g�n sonras�: Sal�");
			break;
		case 3:
			System.out.println("Y�z g�n sonras�: �ar�amba");
			break;	
		case 4:
			System.out.println("Y�z g�n sonras�: Per�embe");
			break;
		case 5:
			System.out.println("Y�z g�n sonras�: Cuma");
			break;
		case 6:
			System.out.println("Y�z g�n sonras�: Cumartesi");
			break;
		case 7:
			System.out.println("Y�z g�n sonras�: Pazar");
			break;
		default:
			System.out.println("Ge�erli bir g�n say�s� giriniz");
			break;
		}
    	
 scan.close();   	
    }
}

