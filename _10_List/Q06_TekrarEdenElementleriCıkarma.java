package _10_List;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q06_TekrarEdenElementleriCıkarma {

    public static void main(String[] args) {
        /*
         * Verilen arraydeki tekrar eden sayilari, ilki haric silip, tekrarsiz
         * sayilardan olusan bir array haline getiren bir program yaziniz.
         *
         * INPUT : {1,2,2,3,1,4,2,5,6,8,7,5,9,1}
         * OUTPUT : [1,2,3,4,5,6,7,8,9]
         */

    	int arr []= {1,2,2,3,1,4,2,5,6,8,7,5,9,1};
    	List <Integer> tekrarsız = new ArrayList <> ();
    	
    	for (Integer s : arr) {
			if (!tekrarsız.contains(s)) {
				tekrarsız.add(s);
			}
		}
    	Collections.sort(tekrarsız);
    	
    	int arrTekrarsız []= new int [tekrarsız.size()]; //Listenin elemanı kadar arr oluşturuldu

for (int i = 0; i < arrTekrarsız.length; i++) {	//bu döngüde listin elemanları arraye eklendi
	arrTekrarsız[i] = tekrarsız.get(i); //index deki her bir list elemanı arr e atandı
}

System.out.println(Arrays.toString(arrTekrarsız));
    }

}
