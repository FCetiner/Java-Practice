package _04_switchCase;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {

        // BugÃ¼ne gÃ¶re 100 gÃ¼n sonra hangi gÃ¼n olduÄŸunuz yazdÄ±rÄ±nÄ±z.
        // pazartesi haftanin ilk gunu olarak aliniz..
        
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Gün numarası giriniz:");
    	int  gün = scan.nextInt();
    	int kalan = 100%7;
    	
    	switch (gün+kalan) {
		case 1:
			System.out.println("Yüz gün sonrası: Pazartesi");
			break;
		case 2:
			System.out.println("Yüz gün sonrası: Salı");
			break;
		case 3:
			System.out.println("Yüz gün sonrası: Çarşamba");
			break;	
		case 4:
			System.out.println("Yüz gün sonrası: Perşembe");
			break;
		case 5:
			System.out.println("Yüz gün sonrası: Cuma");
			break;
		case 6:
			System.out.println("Yüz gün sonrası: Cumartesi");
			break;
		case 7:
			System.out.println("Yüz gün sonrası: Pazar");
			break;
		default:
			System.out.println("Geçerli bir gün sayısı giriniz");
			break;
		}
    	
 scan.close();   	
    }
}

