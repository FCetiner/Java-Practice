package _02_Scanner;

import java.util.Scanner;

public class Q05 {

    public static void main(String[] args) {

    /*  Problem Tan�m�
        Bir dik ��genin iki dik kenar�n� alarak hipoten�s�n� hesaplayan kod yaz�n�z.

        Örnek Ekran Ç�kt�s�
        birinci kenar: 12
        ikinci kenar: 5
        hipotenus: 13      */


        Scanner scan = new Scanner(System.in);

        System.out.print("��genin a kenar uzunlu�unu giriniz: ");
        int a = scan.nextInt();

        System.out.print("��genin b kenar uzunlu�unu giriniz: ");
        int b = scan.nextInt();

        double h = Math.sqrt((a * a) + (b * b));
        System.out.println("Hipoten�s: " + h);

        scan.close();
        
    }
}
