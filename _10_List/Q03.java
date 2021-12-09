package _10_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q03 {

    public static void main(String[] args) {
    /*
   Bir integer list olu�turunuz ve bu list deki tum say�lar�n karesinin
   toplam�n� bulunuz. Sonucu ekrana yazd�r�n�z.
    */

    	List <String> list= new ArrayList <> ();
    	Scanner scan=new Scanner(System.in);
    	System.out.println("Liste atamak i�in say� giriniz");
    	System.out.println("Yeterli say�ya ula�t���n�zde 'q' girin");
    	
    	int toplam=0;
    	String islem ="";
    	
    	while (!islem.equalsIgnoreCase("q")) {
			System.out.println("say� giriniz : ");
			islem=scan.next();
			list.add(islem);
		}
    	
    	list.remove(list.size()-1); //i�inde q bulunmayan sadece say� bulunan list haline geldi
    	
    	//List elemanlar� i�ine girip kareleri toplam� bulun
    	
    	for (String w : list) {
			int a= Integer.parseInt(w);
			toplam+=a*a;
		}
    	scan.close();
    	System.out.println("Say�lar�n kareleri toplam� : " + toplam);
    	
    	/*say�lar.add(2);
    	say�lar.add(3);
    	say�lar.add(4);
    	
    	int toplam=0;
    	for (int i = 0; i < say�lar.size()  ; i++) {
			toplam+=(say�lar.get(i)*say�lar.get(i));
		}
    	System.out.println("Say�lar�n kareleri toplam� :" + toplam);*/
    }
}
