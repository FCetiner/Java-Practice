package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class NotHesaplama {
    public static void main(String[] args) {
        /*
        1.Kullan�c�ya    "Vize s�nav sonucunuzu giriniz :"
        2.vize notu double değerinde girilecek.

        3. Kullan�c�ya  "Vize s�nav� y�zdesini giriniz". ->> double olmal� ->> 0,40 etkiliyor   
        !!Y�zde kaç etkilediğini Sisteme siz giriyorsunuz.!!

        4.Kullan�c�ya    "Final s�nav sonucunuzu giriniz.

        5. final notu double değerinde olmal�. (örn: 65,5)

        6.Kullan�c�ya    "Final s�nav� y�zdesini giriniz"-->> double olmal� ->> 0,60 etkiliyor.

        7. Vize final ortalamas�n� bulmak için, vize nin y�zde40 �, finalin y�zde60 � al�nmal� ve ç�kan sonuçlar toplanmal�d�r.

        8. Ç�kan sonucu (dersin not ortalamas�n�)   double toplam  ' a e�itleyebilirsiniz.

        todo  :  Ko�ul k�sm�
 			eğer ortalamas� 90(90 dahil) 'dan b�y�k ise, harf notu olarak 
 			AA, 80(80dahil)   ile 90 aras�nda ise  
 			BA, 70(70 dahil)   ile 80 aras�nda ise 
 			BB, 60(60dahil) ile 70 aras�nda ise 
 			CB, 50(50 dahil) ile 60 aras�nda ise 
 			CC, 40(40 dahil) ile 50 aras�nda ise 
 			DC, 30(30 dahil) ile 40 aras�nda ise 
 			DD, 30 'dan d���k ise FF  gelmeli.
 			
         */

    	Scanner scan = new Scanner(System.in);
    	System.out.print("Vize s�nav sonucunu giriniz:");
    	double vize = scan.nextDouble();
    	System.out.print("Vize s�nav y�zdesini giriniz:");
    	double vizey�zde = scan.nextDouble();
    	System.out.print("Final s�nav sonucunu giriniz:");
    	double f�nal = scan.nextDouble();
    	System.out.print("Final s�nav y�zdesini giriniz:");
    	double f�naly�zde = scan.nextDouble();
    	
    	double ortalama = (vize*vizey�zde/100)+(f�nal*f�naly�zde/100);
    	
    	System.out.println("Ortalaman�z:" + ortalama);
    	
    	if (ortalama>=90) {
    		System.out.println("Notunuz: AA");
		} else if (ortalama>=80) {
    		System.out.println("Notunuz: BA");
		}else if (ortalama>=70) {
    		System.out.println("Notunuz: BB");
		}else if (ortalama>=60) {
    		System.out.println("Notunuz: CB");
		}else if (ortalama>=50) {
    		System.out.println("Notunuz: CC");
		}else if (ortalama>=40) {
    		System.out.println("Notunuz: DC");
		}else if (ortalama>=30) {
    		System.out.println("Notunuz: DD");
		}else {
			System.out.println("Notunuz: FF");
		}
    	
    	scan.close();
    	
    }
}
