package _10_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q02 {

    public static void main(String[] args) {
     //2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki t�m elemanlar� bir
     //listeye kopyalayan ve harf s�ras�na g�re yazd�ran bir METHOD yaz�n�z.
     //Eg : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
     //   Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]


    	String isimler [][]= {{"Ali","Veli","Ayse"},{"Hasan","Can"},{"Suzan"}};
    	
    	birle�tir(isimler);
    }

	private static void birle�tir(String[][] isimler) {
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
