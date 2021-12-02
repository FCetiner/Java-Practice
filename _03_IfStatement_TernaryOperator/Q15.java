package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
		/*Kullanici tarafindan girilen bir sayinin
		 *mutlak degerini yazdirmak icin bir program yazin.
		 */

		Scanner scan = new Scanner(System.in);
        System.out.println("bir sayý giriniz");
        int x=scan.nextInt();
        
      System.out.println((x>0) ? x : (x*-1));
		
		
		scan.close();
		
		
		
	}

}
