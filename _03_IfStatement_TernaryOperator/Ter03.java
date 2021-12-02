package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Ter03 {

    public static void main(String[] args) {
        // KullanÄ±cÄ±dan bir pozitif tamsayÄ± girmesini isteyin, 
    	//o pozitif tamsayÄ± 3 basamaklÄ± ise ekrana â€œ3 BasamaklÄ±â€? yazdÄ±rÄ±n.
        // 3 basamaklÄ± degilse Ã§ift olup olmadigini kontrol edin. 
    	//Ã‡ift ise â€œ3 basamaklÄ± olmayan Ã§ift sayÄ±â€? yazdÄ±rÄ±n.
        // Ã‡ift sayÄ± degilse â€œ3 basamaklÄ± olmayan tek sayÄ± yazdÄ±rÄ±n.â€?

    	
    	Scanner scan = new Scanner (System.in);
    	System.out.println("Pozitif tam sayı girin:");
    	int sayı=scan.nextInt();
    	
    	System.out.println((sayı%100==0) ? "Üç basamaklı tam sayı" : ((sayı%2==0) ? "üç basamaklı olmayan çift sayı" : "üç basamaklı olmayan tek sayı") );

    	scan.close();
    }
}