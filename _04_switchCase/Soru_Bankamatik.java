package _04_switchCase;

import java.util.Scanner;

public class Soru_Bankamatik {

    public static void main(String[] args) {

        System.out.println("*****************************");
        System.out.println("ATM'ye Ho�geldiniz...");

        String islemler = "1.i�lem : Bakiye ��renme\n2.İi�lem : Para Yat�rma\n"
                + "3.İi�lem : Para �ekme\n"
                + "4.İi�lem : ��k��";

        System.out.println(islemler);
        System.out.println("*****************************");

        int bakiye = 1000;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Yapmak istedi�iniz ii�lemi se�iniz: ");
        String islem = scanner.nextLine();

        switch (islem) {
            case "1":
                System.out.println("Bakiyeniz: " + bakiye);
                break;

            case "2":
                System.out.print("Yat�rmak istedi�iniz tutar� girin: ");

                int tutar = scanner.nextInt();

                bakiye += tutar;

                System.out.println("Yeni bakiyeniz: " + bakiye);
                break;


            case "3":
                System.out.print("�ekmek istedi�iniz tutar� girin: ");
                int tutar2 = scanner.nextInt();


                if (tutar2 <= bakiye) {
                    bakiye -= tutar2;
                    System.out.println("Yeni bakiyeniz: " + bakiye);
                } else {
                    System.out.println("Yeterli bakiyeniz yok...");
                }
                break;

            case "4":
                System.out.println("��k�� yap�l�yor...");
                break;
            default:
                System.out.println("Ge�ersiz ii�lem...");
                break;
        }
scanner.close();
    }
}

