package _05_StringManipulation;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        // Kullanýcýdan alacaðýný bir stringde boÅŸluk karakterinin olup olmadýðýný kontrol ediniz.
        

        // Kullanýcýdan alacaðýný bir stringin bos olup olmadýðýný kontrol ediniz.
       
    	Scanner scan = new Scanner(System.in);
    	System.out.print("bir String giriniz:");
    	String str = scan.nextLine();
    
    	boolean varMi = str.contains(" ");
    	
    	System.out.println("Girilen Stringde boþluk var mý ?" + varMi);
   
    System.out.println("Girilen string boþ mu ?" + str.isEmpty());
    	
    	
    	scan.close();
    }
}

