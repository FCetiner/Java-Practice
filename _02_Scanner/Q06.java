package _02_Scanner;

import java.util.Scanner;

public class Q06 {

    public static void main(String[] args) {

    /*  Problem Tanımı
        Mesafeyi ve hızı alıp süreyi hesaplayan bir kod yazınız.
        örneÄŸin:istanbul ile Ankara arası 400km olarak Ã¶lÃ§ülmektedir. Bu yolu ortalama
        120 km/saat hızla giden bir araÃ§ ne kadar sürede hedefe varır?

        örnek Ekran çıktısı
        Mesafeyi giriniz: 400
        Hızı giriniz: 100
        Süre 4 saattir.
     */

        Scanner scanner = new Scanner(System.in);

        System.out.print("GideceÄŸiniz yol mesafesi(km): ");
        double yol = scanner.nextDouble();

        System.out.print("Ortalama Hızınız(km/sa): ");
        double ort_hiz = scanner.nextDouble();

        double varis_suresi = yol / ort_hiz;
        System.out.print("VarıÅŸ süreniz: " + varis_suresi + " saat");

        scanner.close();
        

    }
}
