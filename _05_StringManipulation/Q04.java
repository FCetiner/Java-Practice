package _05_StringManipulation;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        // Kullanicidan 4 harfli bir kelime isteyin
        // ve girilen kelimeyi tersten yazdirin

    	Scanner scan = new Scanner(System.in);
    	System.out.print("4 harfli bir kelime giriniz:");
    	String str = scan.nextLine();
    	
    	if (str.length()==4) {
			System.out.println(str.substring(3)+ str.substring(2,3)+ str.substring(1,2)+str.substring(0,1));
		} else {
			System.out.println("Lütfen 4 harfli bir kelime giriniz");
		}
    	
    	

    	scan.close();		
    	
    }
}
