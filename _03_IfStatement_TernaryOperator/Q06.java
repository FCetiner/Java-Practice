package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        //// Kullanýcýdan aldýðýnýz koordinat noktasýnýn hangi bÃ¶lgede olduÄŸunu yazdÄ±ran bir kod yazÄ±nÄ±z.

    	Scanner scan = new Scanner(System.in);
    	System.out.println("Lütfen 2 tane koordinat giriniz");
    	double k1= scan.nextDouble();
    	double k2= scan.nextDouble();
    	
    	if (k1==0 || k2==0) {
			System.out.println("Geçerli koordinat giriniz");
		} else if(k1>0 && k2>0){
			System.out.println("1. bölge");
		} else if(k1<0 && k2>0){
			System.out.println("2. bölge");
		} else if(k1<0 && k2<0){
			System.out.println("3. bölge");
		} else if(k1>0 && k2<0){
			System.out.println("4. bölge");
		} else {
			System.out.println("Geçerli 2 tane koordinat giriniz");
		}
    	
    	scan.close();
    	
    }
}
