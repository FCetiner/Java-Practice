package _02_Scanner;

import java.util.Scanner;

public class Q11 {

    public static void main(String[] args) {
        /*
        TechProEd spor salonu i�in kullan�c�dan isim soyisim, ya�, kilo, boy, salona devam edece�i ay s�resini
        bilgilerini al�p ayl�k $20 olarak toplam �cretini yazd�r�n�z.
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("TechProEd Salonu'na ho�geldiniz!");

        System.out.print("isim Soyisim: ");
        String isim = scan.nextLine();

        System.out.print("ya��n�z: ");
        int yas = scan.nextInt();

        System.out.print("Kilo: ");
        double kilo = scan.nextDouble();

        System.out.print("Boy: ");
        double boy = scan.nextDouble();

        System.out.print("ka� ayl�k kaydolacaks�n�z: ");
        int aylik = scan.nextInt();

        int aylik_ucret = 20;

        int toplam_tutar = aylik_ucret * aylik;

        System.out.print("Toplam Tutar: " + toplam_tutar + " Euro");

scan.close();
    }
}
