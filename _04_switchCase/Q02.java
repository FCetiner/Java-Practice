package _04_switchCase;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
// 2- Girilen 3 basamakl� bir say�y� yaz� ile yazd�r�n�z

       Scanner scan = new Scanner(System.in);
       System.out.println("�� basamakl� bir say� giriniz:");
       int say� = scan.nextInt();
       
       int birler = say�%10;
       int onlar = (say�/10)%10;
       int y�zler = (say�/100)%10;
       
       System.out.println("Girdi�iniz say�  " + say� + "  okunu�u=>   ");
       switch (y�zler) {
	case 1:
		System.out.println("y�z");
		break;
	case 2:
		System.out.println("iki y�z");
		break;
	case 3:
		System.out.println("�� y�z");
		break;
	case 4:
		System.out.println("d�rt y�z");
		break;
	case 5:
		System.out.println("be� y�z");
		break;
	case 6:
		System.out.println("alt� y�z");
		break;
	case 7:
		System.out.println("yedi y�z");
		break;
	case 8:
		System.out.println("sekiz y�z");
		break;
	case 9:
		System.out.println("dokuz y�z");
		break;
	default:
		System.out.println("Ge�ersiz say�");
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
   		System.out.println("k�rk");
   		break;
   	case 5:
   		System.out.println("elli");
   		break;
   	case 6:
   		System.out.println("altm��");
   		break;
   	case 7:
   		System.out.println("yetmi�");
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
   		System.out.println("��");
   		break;
   	case 4:
   		System.out.println("d�rt");
   		break;
   	case 5:
   		System.out.println("be�");
   		break;
   	case 6:
   		System.out.println("alt�");
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
