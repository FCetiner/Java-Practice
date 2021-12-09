package _10_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q02 {

    public static void main(String[] args) {
     //2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki tüm elemanlarý bir
     //listeye kopyalayan ve harf sýrasýna göre yazdýran bir METHOD yazýnýz.
     //Eg : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
     //   Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]


    	String isimler [][]= {{"Ali","Veli","Ayse"},{"Hasan","Can"},{"Suzan"}};
    	
    	birleþtir(isimler);
    }

	private static void birleþtir(String[][] isimler) {
		List < String> list = new ArrayList <> ();
		
		for (int i = 0; i < isimler.length; i++) {
			for (int j = 0; j < isimler[i].length; j++) {
				list.add(isimler[i][j]);
			}
		}
		
		Collections.sort(list);
		System.out.println(list);
	}

}
