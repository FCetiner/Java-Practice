package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q03_BMI {

	public static void main(String[] args) {
		 /*  Kullanicidan boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
         *
        BMI = kilo(kg) /(boy/100*boy/100)(cm)
        BMI <=20 oldukca zayifsiniz
        20<BMI<=25 Normal sinirlardasiniz 
        25<BMI<=30 Sisman kategorisindesiniz
        30<BMI ==> Obez grubundasiniz.
        
         */

		Scanner scan = new Scanner(System.in);
		System.out.print("L�tfen boyunuzu cm olarak giriniz:");
		double boy = scan.nextDouble();
		System.out.print("L�tfen kilonuzu kg olarak giriniz:");
		double kilo = scan.nextDouble();
		
		double vki = kilo/((boy/100)*(boy/100));
		System.out.print("V�cut kitle endeksiniz:" + vki);
		
		if (vki<=20) {
			System.out.println("olduk�a zay�fs�n�z");
		} else if (vki<=25) {
			System.out.println("normal s�n�rdas�n�z");
		} else if (vki<=30) {
			System.out.println("�i�man kategorisindesiniz");
		}else {
			System.out.println("Obez");
		}
		
		
		scan.close();
    }

}
