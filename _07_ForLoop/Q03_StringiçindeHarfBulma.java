package _07_ForLoop;

import java.util.Scanner;

public class Q03_StringiçindeHarfBulma {
    public static void main(String[] args) {

        /*
        Girilen bir stringdeki a harfi sayýsýný bulunuz.
        ama  c harfine  gelirse döngüden çýkýlsýn

        Bugün hava oldukca güzel.-> 2
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
    	System.out.println("girdiðiniz string'deki a sayýsý:" + aMiktari);
   scan.close();
    }

}
