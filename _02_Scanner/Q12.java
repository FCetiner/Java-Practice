package _02_Scanner;

import java.util.Scanner;

public class Q12 {

    public static void main(String[] args) {

    /*  Problem Tanýmý
        Bir iþçinin iþi bitirme süresini ve toplam iþçi sayýsýný alarak, iþin bitme süresini
        hesaplayan kodu yazýnýz.
        örneðin, Bir iþçi bir iþi 10 günde yapabilmektedir.
        Buna göre 2 iþçi ayný iþi kaç günde yapar?

        örnek Ekran çýktýsý
         Bir iþçi iþi kaç günde bitirmektedir? 10
         Toplam kaç iþçi çalýþacak? 2
        iþin bitme süresi 5 gündür.
    */

        Scanner scan = new Scanner(System.in);

        System.out.print("Bir iþçi bir iþi kaç günde bitirmektedir: ");
        int bir_isci= scan.nextInt();

        System.out.print("Toplam kaç kiþi çalýþacak: ");
        int isci_sayisi = scan.nextInt();

        int coklu_bitirme_suresi = bir_isci / isci_sayisi;
        System.out.println("Ýþin bitme süresi: " + coklu_bitirme_suresi);

scan.close();
    }
}
