package _10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q08_ListeninElemanýnýSetEtme {

    public static void main(String[] args) {
        /*
         * 10 elamanli bir list olusturun. Ardindan dizinin 3. elemani ile
         * 8. elemaninin yerlerini degistirin.
         *
         * ORNEK:
         *
         * INPUT : String[] isimler={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
         * OUTPUT : String[] isimler={"Umit","Emin","Furkan","Kerem","Taylan","Orhan","Sinan","Kemal","Ahmet","Ali"};
         */

    	List <String> list =  new ArrayList<> (Arrays.asList("Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"));
    	
    	String kova="";
    	kova=list.get(2);
    	
    	list.set(2, list.get(7));
    	list.set(7, kova);
    	System.out.println(list);

    }

}
