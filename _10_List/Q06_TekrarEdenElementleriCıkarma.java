package _10_List;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q06_TekrarEdenElementleriCýkarma {

    public static void main(String[] args) {
        /*
         * Verilen arraydeki tekrar eden sayilari, ilki haric silip, tekrarsiz
         * sayilardan olusan bir array haline getiren bir program yaziniz.
         *
         * INPUT : {1,2,2,3,1,4,2,5,6,8,7,5,9,1}
         * OUTPUT : [1,2,3,4,5,6,7,8,9]
         */

    	int arr []= {1,2,2,3,1,4,2,5,6,8,7,5,9,1};
    	List <Integer> tekrarsýz = new ArrayList <> ();
    	
    	for (Integer s : arr) {
			if (!tekrarsýz.contains(s)) {
				tekrarsýz.add(s);
			}
		}
    	Collections.sort(tekrarsýz);
    	
    	int arrTekrarsýz []= new int [tekrarsýz.size()]; //Listenin elemaný kadar arr oluþturuldu

for (int i = 0; i < arrTekrarsýz.length; i++) {	//bu döngüde listin elemanlarý arraye eklendi
	arrTekrarsýz[i] = tekrarsýz.get(i); //index deki her bir list elemaný arr e atandý
}

System.out.println(Arrays.toString(arrTekrarsýz));
    }

}
