package _02_Scanner;

import java.util.Scanner;

public class Q06 {

    public static void main(String[] args) {

    /*  Problem Tan�m�
        Mesafeyi ve h�z� al�p s�reyi hesaplayan bir kod yaz�n�z.
        �rneğin:istanbul ile Ankara aras� 400km olarak ölç�lmektedir. Bu yolu ortalama
        120 km/saat h�zla giden bir araç ne kadar s�rede hedefe var�r?

        �rnek Ekran ��kt�s�
        Mesafeyi giriniz: 400
        H�z� giriniz: 100
        S�re 4 saattir.
     */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Gideceğiniz yol mesafesi(km): ");
        double yol = scanner.nextDouble();

        System.out.print("Ortalama H�z�n�z(km/sa): ");
        double ort_hiz = scanner.nextDouble();

        double varis_suresi = yol / ort_hiz;
        System.out.print("Var�ş s�reniz: " + varis_suresi + " saat");

        scanner.close();
        

    }
}
