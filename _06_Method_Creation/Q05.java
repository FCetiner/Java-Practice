package _06_Method_Creation;

import java.util.Scanner;

public class Q05 {

    public static void main(String[] args) {
         /*
        Problem tanýmý :
        Bir String içinde kaç kelime olduðunu yazdýran bir method yazýnýz.
       Test Data:
       Input the string: The quick brown fox jumps over the lazy dog.
 	   Expected Output: Number of words in the string: 9
         */

    	Scanner scan = new Scanner(System.in);
    	System.out.println("Bir metin girin");
    	String str=scan.nextLine();
    	
    	countStr(str);
    	

       scan.close();
    }

	private static void countStr(String str) {
		
		int sayac=0;
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i)==' ') {
				sayac++;
			}
		}
		System.out.println("Number of words in the string : " + (sayac+1));
		//niye sayac+1 çünki for içinde a<str.length e kadar ama eþit deðil 1 eksik verir


//
//        	   String[] words=str.split(" ");
//
//
//
//        	   return words.length;
	}
}
