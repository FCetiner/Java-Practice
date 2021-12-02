package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Ter01 {

    public static void main(String[] args) {

        //Kullanicidan bir sayi aliniz
        //Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
        //10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
        //Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.

    	
    	Scanner scan = new Scanner (System.in);
    	System.out.println("Bir sayı giriniz:");
    	
    	int sayı = scan.nextInt();
    	
    	   	
        String result = (sayı>=0) ? ((sayı<10) ? ("rakam") : ("pozitif sayı")) : ("Negatif Sayı");

        System.out.println(result);
        
    scan.close();
    }
}
