package _10_List;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q06_TekrarEdenElementleriC�karma {

    public static void main(String[] args) {
        /*
         * Verilen arraydeki tekrar eden sayilari, ilki haric silip, tekrarsiz
         * sayilardan olusan bir array haline getiren bir program yaziniz.
         *
         * INPUT : {1,2,2,3,1,4,2,5,6,8,7,5,9,1}
         * OUTPUT : [1,2,3,4,5,6,7,8,9]
         */

    	int arr []= {1,2,2,3,1,4,2,5,6,8,7,5,9,1};
    	List <Integer> tekrars�z = new ArrayList <> ();
    	
    	for (Integer s : arr) {
			if (!tekrars�z.contains(s)) {
				tekrars�z.add(s);
			}
		}
    	Collections.sort(tekrars�z);
    	
    	int arrTekrars�z []= new int [tekrars�z.size()]; //Listenin eleman� kadar arr olu�turuldu

for (int i = 0; i < arrTekrars�z.length; i++) {	//bu d�ng�de listin elemanlar� arraye eklendi
	arrTekrars�z[i] = tekrars�z.get(i); //index deki her bir list eleman� arr e atand�
}

System.out.println(Arrays.toString(arrTekrars�z));
    }

}
