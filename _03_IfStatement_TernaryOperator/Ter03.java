package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Ter03 {

    public static void main(String[] args) {
        // Kullanıcıdan bir pozitif tamsayı girmesini isteyin, 
    	//o pozitif tamsayı 3 basamaklı ise ekrana “3 Basamaklı�? yazdırın.
        // 3 basamaklı degilse çift olup olmadigini kontrol edin. 
    	//Çift ise “3 basamaklı olmayan çift sayı�? yazdırın.
        // Çift sayı degilse “3 basamaklı olmayan tek sayı yazdırın.�?

    	
    	Scanner scan = new Scanner (System.in);
    	System.out.println("Pozitif tam say� girin:");
    	int say�=scan.nextInt();
    	
    	System.out.println((say�%100==0) ? "�� basamakl� tam say�" : ((say�%2==0) ? "�� basamakl� olmayan �ift say�" : "�� basamakl� olmayan tek say�") );

    	scan.close();
    }
}