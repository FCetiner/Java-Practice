package _07_ForLoop;

import java.util.Scanner;

public class Q03_Stringi�indeHarfBulma {
    public static void main(String[] args) {

        /*
        Girilen bir stringdeki a harfi say�s�n� bulunuz.
        ama  c harfine  gelirse d�ng�den ��k�ls�n

        Bug�n hava oldukca g�zel.-> 2
         */
        
    	Scanner scan =new Scanner(System.in);
    	System.out.println("Bir String giriniz");
    	String str=scan.nextLine();
    	
    	int aMiktari=0;
    	
    	for (int i = 0; i < str.length(); i++) {
			if (str.toLowerCase().charAt(i)=='a') {  //Method coin method zinciri;
				
			aMiktari++;
		} else if (str.toLowerCase().charAt(i)=='c'){
		break;		
		}
    		
		}
    	System.out.println("girdi�iniz string'deki a say�s�:" + aMiktari);
   scan.close();
    }

}
