package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        //// Kullan�c�dan ald���n�z koordinat noktas�n�n hangi bölgede olduğunu yazdıran bir kod yazınız.

    	Scanner scan = new Scanner(System.in);
    	System.out.println("L�tfen 2 tane koordinat giriniz");
    	double k1= scan.nextDouble();
    	double k2= scan.nextDouble();
    	
    	if (k1==0 || k2==0) {
			System.out.println("Ge�erli koordinat giriniz");
		} else if(k1>0 && k2>0){
			System.out.println("1. b�lge");
		} else if(k1<0 && k2>0){
			System.out.println("2. b�lge");
		} else if(k1<0 && k2<0){
			System.out.println("3. b�lge");
		} else if(k1>0 && k2<0){
			System.out.println("4. b�lge");
		} else {
			System.out.println("Ge�erli 2 tane koordinat giriniz");
		}
    	
    	scan.close();
    	
    }
}
