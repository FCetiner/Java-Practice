package _02_Scanner;

import java.util.Scanner;

public class Q05 {

    public static void main(String[] args) {

    /*  Problem Tanýmý
        Bir dik üçgenin iki dik kenarýný alarak hipotenüsünü hesaplayan kod yazýnýz.

        Ã–rnek Ekran Ã‡ýktýsý
        birinci kenar: 12
        ikinci kenar: 5
        hipotenus: 13      */


        Scanner scan = new Scanner(System.in);

        System.out.print("üçgenin a kenar uzunluðunu giriniz: ");
        int a = scan.nextInt();

        System.out.print("üçgenin b kenar uzunluðunu giriniz: ");
        int b = scan.nextInt();

        double h = Math.sqrt((a * a) + (b * b));
        System.out.println("Hipotenüs: " + h);

        scan.close();
        
    }
}
