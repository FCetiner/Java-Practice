package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Ter02_VerilenHarfKüçükmüBüyükmü {

    public static void main(String[] args) {
        // Kullanicidan bir character girmesini isteyiniz
        // Character harf ise kucuk harf olup olmadigini kontrol ediniz
        // Kucuk harf ise ekrana "Kucuk Harf" yazdiriniz
        // Buyuk harf ise ekrana "Buyuk Harf" yazdiriniz
        // Harf degilse ekrana "Harf degil" yazdiriniz
        //97:a  122:z ascii deðeri
    	
    	Scanner scan= new Scanner(System.in);
		
		System.out.println("Lutfen bir karekter giriniz");
        
        char krk =scan.next().charAt(0);
        
        System.out.println(krk>= 'A' && krk<='Z' || krk>='a' && krk<='z' ? ((krk>='a' && krk<='z') ? "küçük harf" :"büyük harf") :
        	"harf deðil");
   
        scan.close();
		
       
    }
}
