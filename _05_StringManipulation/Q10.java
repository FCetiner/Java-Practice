package _05_StringManipulation;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        /*
         * Kullan�c�dan ald���n�z  Ad�, Soyad� ve kredi kart� numaralar�n� a�a��daki gibi �zel forma d�n��t�r�n
         * Kredi kart� numaras�n� kontrol edin, yoksa 16 haneden k���k olursa   "Ge�ersiz kredi kart� numaras�" yazd�r�n.
         * input : John White 1234234534561478
           output: Ad : J*** Soyad :W**** kartNo:***********1478 (Ad�n ba� harfleri ve soyad� b�y�k olmal�d�r)
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
    	System.out.print("�sminizi giriniz:");
    	String isim = scan.nextLine();
    	System.out.print("Soyisminizi giriniz:");
    	String soyisim = scan.nextLine();
    	System.out.print("Kredi Kart� numaran�z� giriniz:");
    	String kart = scan.nextLine();
    	
    	if (kart.length()<16) {
			System.out.println("Ge�ersiz Kredi kart� numaras�");
		} 
    	
    	System.out.println("Ad  :" + isim.toUpperCase().charAt(0) + isim.substring(1).replaceAll("\\w", "*")+
    						"\nSoyad  :" + soyisim.toUpperCase().charAt(0)+isim.substring(1).replaceAll("\\w", "*")+
    						"\nKart no  :" + kart.substring(0, 13).replaceAll("\\d", "*") + kart.substring(12)); 
    	scan.close();
    	
    }
}
