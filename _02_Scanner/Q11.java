package _02_Scanner;

import java.util.Scanner;

public class Q11 {

    public static void main(String[] args) {
        /*
        TechProEd spor salonu için kullanýcýdan isim soyisim, yaþ, kilo, boy, salona devam edeceði ay süresini
        bilgilerini alýp aylýk $20 olarak toplam ücretini yazdýrýnýz.
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("TechProEd Salonu'na hoþgeldiniz!");

        System.out.print("isim Soyisim: ");
        String isim = scan.nextLine();

        System.out.print("yaþýnýz: ");
        int yas = scan.nextInt();

        System.out.print("Kilo: ");
        double kilo = scan.nextDouble();

        System.out.print("Boy: ");
        double boy = scan.nextDouble();

        System.out.print("kaç aylýk kaydolacaksýnýz: ");
        int aylik = scan.nextInt();

        int aylik_ucret = 20;

        int toplam_tutar = aylik_ucret * aylik;

        System.out.print("Toplam Tutar: " + toplam_tutar + " Euro");

scan.close();
    }
}
