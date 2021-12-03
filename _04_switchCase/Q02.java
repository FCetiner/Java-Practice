package _04_switchCase;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
// 2- Girilen 3 basamaklý bir sayýyý yazý ile yazdýrýnýz

       Scanner scan = new Scanner(System.in);
       System.out.println("Üç basamaklý bir sayý giriniz:");
       int sayý = scan.nextInt();
       
       int birler = sayý%10;
       int onlar = (sayý/10)%10;
       int yüzler = (sayý/100)%10;
       
       System.out.println("Girdiðiniz sayý  " + sayý + "  okunuþu=>   ");
       switch (yüzler) {
	case 1:
		System.out.println("yüz");
		break;
	case 2:
		System.out.println("iki yüz");
		break;
	case 3:
		System.out.println("üç yüz");
		break;
	case 4:
		System.out.println("dört yüz");
		break;
	case 5:
		System.out.println("beþ yüz");
		break;
	case 6:
		System.out.println("altý yüz");
		break;
	case 7:
		System.out.println("yedi yüz");
		break;
	case 8:
		System.out.println("sekiz yüz");
		break;
	case 9:
		System.out.println("dokuz yüz");
		break;
	default:
		System.out.println("Geçersiz sayý");
	}
    	
       switch (onlar) {
    case 0:
      	System.out.println(" ");
      break;
    case 1:
   		System.out.println("on");
   		break;
   	case 2:
   		System.out.println("yirmi ");
   		break;
   	case 3:
   		System.out.println("otuz");
   		break;
   	case 4:
   		System.out.println("kýrk");
   		break;
   	case 5:
   		System.out.println("elli");
   		break;
   	case 6:
   		System.out.println("altmýþ");
   		break;
   	case 7:
   		System.out.println("yetmiþ");
   		break;
   	case 8:
   		System.out.println("seksen");
   		break;
   	case 9:
   		System.out.println("doksan");
   		break;
   	}	
       switch (birler) {
      case 0:
    	System.out.println("  ");
      break;
      case 1:
   		System.out.println("bir");
   		break;
   	case 2:
   		System.out.println("iki");
   		break;
   	case 3:
   		System.out.println("üç");
   		break;
   	case 4:
   		System.out.println("dört");
   		break;
   	case 5:
   		System.out.println("beþ");
   		break;
   	case 6:
   		System.out.println("altý");
   		break;
   	case 7:
   		System.out.println("yedi");
   		break;
   	case 8:
   		System.out.println("sekiz");
   		break;
   	case 9:
   		System.out.println("dokuz");
   		break;
   	}
 scan.close();
    
    }
}
