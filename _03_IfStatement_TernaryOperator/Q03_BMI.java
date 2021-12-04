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
		System.out.print("Lütfen boyunuzu cm olarak giriniz:");
		double boy = scan.nextDouble();
		System.out.print("Lütfen kilonuzu kg olarak giriniz:");
		double kilo = scan.nextDouble();
		
		double vki = kilo/((boy/100)*(boy/100));
		System.out.print("Vücut kitle endeksiniz:" + vki);
		
		if (vki<=20) {
			System.out.println("oldukça zayýfsýnýz");
		} else if (vki<=25) {
			System.out.println("normal sýnýrdasýnýz");
		} else if (vki<=30) {
			System.out.println("þiþman kategorisindesiniz");
		}else {
			System.out.println("Obez");
		}
		
		
		scan.close();
    }

}
