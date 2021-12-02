package _03_IfStatement_TernaryOperator;
import java.util.Scanner;

public class Q16 {
/*
    Kullanicidan 3 Numara isteyiniz ve bu numaralarin en buyuk ve 
    en kucuk olanlarini konsola yazdiriniz
    int num1 
    int num2 
    int num3
*/
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Arka arkaya 3 sayý giriniz");
        int x=scan.nextInt();
        int y=scan.nextInt();
        int z=scan.nextInt();
        
         if (x>y && y>z) {
			System.out.println("The oldest one:" + x );
			System.out.println("The youngest one:" + z );
		} else if (y>z && z>x){
			System.out.println("The oldest one:" + y );
			System.out.println("The youngest one:" + x );
		}else if (z>y && y>x){
			System.out.println("The oldest one:" + z );
			System.out.println("The youngest one:" + x);
		}
		
				
scan.close();
    	
    	
    }
}

