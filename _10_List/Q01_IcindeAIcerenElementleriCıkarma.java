package _10_List;

import java.util.ArrayList;
import java.util.List;

public class Q01_IcindeAIcerenElementleriCýkarma {

    public static void main(String[] args) {
        /*
         * Input olarak verilen listteki isimlerden
         * icinde 'a' harfi bulunanlari silen bir program yaziniz
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */

    	List <String> isimler= new ArrayList <> ();
    	isimler.add("Ali");
    	isimler.add("Veli");
    	isimler.add("Ayse");
    	isimler.add("Fatma");
    	isimler.add("Omer");
    	
    //	List <String> isimler= new ArrayList <> (Arrays.asList("Ali","Veli","Ayse","Fatma","Omer"));
    	//Add ile ugrasmak istemezsek bu þekilde list oluþturulabilir
    	
    	//Sýra önemli deðilse for each kullanýlýr
    	
    	List <String> isimler2= new ArrayList <> ();
    	for (String each : isimler) {
			if (!each.toLowerCase().contains("a")) {
				isimler2.add(each);
			} 
		}
    	
    	//System.out.println(isimler2);
    	System.out.println(isimler2.toString().replace(", ", ","));
    	
    	/*for (int i = 0; i < isimler.size() ; i++) {
			if (isimler.get(i).toLowerCase().contains("a")  ) {
				isimler.remove(i);
				i--;
			}
		
    	}*/
    	
    }


}
