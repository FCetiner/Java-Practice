package _05_StringManipulation;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        /*
         * Kullanýcýdan aldýðýnýz  Adý, Soyadý ve kredi kartý numaralarýný aþaðýdaki gibi özel forma dönüþtürün
         * Kredi kartý numarasýný kontrol edin, yoksa 16 haneden küçük olursa   "Geçersiz kredi kartý numarasý" yazdýrýn.
         * input : John White 1234234534561478
           output: Ad : J*** Soyad :W**** kartNo:***********1478 (Adýn baþ harfleri ve soyadý büyük olmalýdýr)
         */
		 /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
		 1) \\d    ==> tum rakamlar         0->9
		  	 \\D    ==> tum rakam disi character ler  0->9    _ disindaki hersey
		 2) \\w   ==> A->Z		a->z
		 	 \\W  ==> A->Z		a->z		tum harf disi character ler
		 3) \\s   ==> space
		 	 \\S   ==> space disindaki hersey
	 */
       
    	Scanner scan = new Scanner(System.in);
    	System.out.print("Ýsminizi giriniz:");
    	String isim = scan.nextLine();
    	System.out.print("Soyisminizi giriniz:");
    	String soyisim = scan.nextLine();
    	System.out.print("Kredi Kartý numaranýzý giriniz:");
    	String kart = scan.nextLine();
    	
    	if (kart.length()<16) {
			System.out.println("Geçersiz Kredi kartý numarasý");
		} 
    	
    	System.out.println("Ad  :" + isim.toUpperCase().charAt(0) + isim.substring(1).replaceAll("\\w", "*")+
    						"\nSoyad  :" + soyisim.toUpperCase().charAt(0)+isim.substring(1).replaceAll("\\w", "*")+
    						"\nKart no  :" + kart.substring(0, 13).replaceAll("\\d", "*") + kart.substring(12)); 
    	scan.close();
    	
    }
}
