package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q13 {

    public static void main(String[] args) {

    /*  Problem Tanımı
        Kullanıcıdan üç adet sayı alarak bu sayıların
        bir dik üçgenin kenar uzunlukları olup olmadığını hesaplatan bir kod yazınız
        (Yardım: Bir üçgenin dik olduğunu anlamak için a2+b2=c2 pisagor
        bağlantısından yararlanabilirsiniz)

        Örnek Ekran Çıktısı
        birinci kenarı giriniz: 2
        ikinci kenarı giriniz 15
        üçüncü kenarı giriniz: 7
        Bu bir dik üçgen değildir.

        Bu bir dik üçgendir
     */

    	Scanner scan=new Scanner(System.in);
		System.out.println("kenar uzunluklar�n� girin");
		Double x =scan.nextDouble();
		Double y =scan.nextDouble();
		Double z = scan.nextDouble();
		
		if ((x*x+y*y==z*z)) {
			System.out.println("dik ��gen");
		} else {
			System.out.println("dik ��gen de�il");
		}
		 
		scan.close();
       


    }
}
