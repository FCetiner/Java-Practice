package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Ter02_VerilenHarfK���km�B�y�km� {

    public static void main(String[] args) {
        // Kullanicidan bir character girmesini isteyiniz
        // Character harf ise kucuk harf olup olmadigini kontrol ediniz
        // Kucuk harf ise ekrana "Kucuk Harf" yazdiriniz
        // Buyuk harf ise ekrana "Buyuk Harf" yazdiriniz
        // Harf degilse ekrana "Harf degil" yazdiriniz
        //97:a  122:z ascii de�eri
    	
    	Scanner scan= new Scanner(System.in);
		
		System.out.println("Lutfen bir karekter giriniz");
        
        char krk =scan.next().charAt(0);
        
        System.out.println(krk>= 'A' && krk<='Z' || krk>='a' && krk<='z' ? ((krk>='a' && krk<='z') ? "k���k harf" :"b�y�k harf") :
        	"harf de�il");
   
        scan.close();
		
       
    }
}
