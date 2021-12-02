package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q11 {

    public static void main(String[] args) {

    /*  Problem Tanımı
        Kullanıcıdan bir tarihi gün, ay ve yıl şeklinde alıp bu tarihi
        ay, gün, yıl ve yıl, ay, gün sıralarına çevirerek yazan bir kod yazınız.
    	TRICK: her else komutundan sonra return; komutu kullanınız...

        Örnek Ekran Çıktısı
        Lütfen günü giriniz: 10
        Lütfen ayı giriniz: 02
        Lütfen yılı giriniz: 2009
        Gün ay yıl: 10.02.2009
        Ay gün yıl: 02.10.2009
        Yıl ay gün: 2009.02.10
        */

    	
    	Scanner scan=new Scanner(System.in);
    	System.out.println("L�tfen g�n giriniz");
    	String gun=scan.next();
  
    	System.out.println("L�tfen ay giriniz");
    	String ay=scan.next();
    	
    	System.out.println("L�tfen y�l giriniz");
    	String y�l=scan.next();
    	
    	System.out.println(gun+"."+ay+"."+y�l);
scan.close();
    }
}
