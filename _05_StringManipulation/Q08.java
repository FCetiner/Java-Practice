package _05_StringManipulation;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        /*
         * Kulanicidan bir kelime isteyin eger kelime 3 ve daha fazla harfden olusuyorsa son
         * iki harfini 3 kere yan yana yazdirin. degil ise girilen kelimeyi yazdirin
         *
         * ornek
         * input = Ali
         * output = lilili
         *
         * input = el
         * output = el
         */
       
    	Scanner scan = new Scanner(System.in);
    	System.out.print("Bir kelime giriniz:");
    	String str = scan.nextLine();
    	
    	if (str.length()>2) {
			System.out.println("Son 2 harf:" + str.substring(str.length()-2) + str.substring(str.length()-2)
			+ str.substring(str.length()-2));
		} else {
			System.out.println("Girdiðiniz kelime:"+str);
		}
    	
    
    scan.close();
    }
}
