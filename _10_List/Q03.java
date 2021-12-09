package _10_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q03 {

    public static void main(String[] args) {
    /*
   Bir integer list oluþturunuz ve bu list deki tum sayýlarýn karesinin
   toplamýný bulunuz. Sonucu ekrana yazdýrýnýz.
    */

    	List <String> list= new ArrayList <> ();
    	Scanner scan=new Scanner(System.in);
    	System.out.println("Liste atamak için sayý giriniz");
    	System.out.println("Yeterli sayýya ulaþtýðýnýzde 'q' girin");
    	
    	int toplam=0;
    	String islem ="";
    	
    	while (!islem.equalsIgnoreCase("q")) {
			System.out.println("sayý giriniz : ");
			islem=scan.next();
			list.add(islem);
		}
    	
    	list.remove(list.size()-1); //içinde q bulunmayan sadece sayý bulunan list haline geldi
    	
    	//List elemanlarý içine girip kareleri toplamý bulun
    	
    	for (String w : list) {
			int a= Integer.parseInt(w);
			toplam+=a*a;
		}
    	scan.close();
    	System.out.println("Sayýlarýn kareleri toplamý : " + toplam);
    	
    	/*sayýlar.add(2);
    	sayýlar.add(3);
    	sayýlar.add(4);
    	
    	int toplam=0;
    	for (int i = 0; i < sayýlar.size()  ; i++) {
			toplam+=(sayýlar.get(i)*sayýlar.get(i));
		}
    	System.out.println("Sayýlarýn kareleri toplamý :" + toplam);*/
    }
}
