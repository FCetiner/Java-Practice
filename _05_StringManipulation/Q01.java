package _05_StringManipulation;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        // Kullan�c�dan alaca��n� bir stringde boşluk karakterinin olup olmad���n� kontrol ediniz.
        

        // Kullan�c�dan alaca��n� bir stringin bos olup olmad���n� kontrol ediniz.
       
    	Scanner scan = new Scanner(System.in);
    	System.out.print("bir String giriniz:");
    	String str = scan.nextLine();
    
    	boolean varMi = str.contains(" ");
    	
    	System.out.println("Girilen Stringde bo�luk var m� ?" + varMi);
   
    System.out.println("Girilen string bo� mu ?" + str.isEmpty());
    	
    	
    	scan.close();
    }
}

