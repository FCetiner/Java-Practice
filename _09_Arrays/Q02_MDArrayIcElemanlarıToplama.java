package _09_Arrays;

import java.util.Arrays;

public class Q02_MDArrayIcElemanlar�Toplama {
    public static void main(String[] args) {


        //multidimensional arrayin i� array lerindeki t�m elemanlar�n toplam�n� birer birer bulan
        // ve herbir sonucu yeni bir arrayin eleman� yapan ve yeni array i ekrana yazd�ran program� yaziniz.
        //input {{10,20,30},{4},{6,7,20}}==> output ={60,4,33}

    	int arr1 [][]={{10,20,30},{4},{6,7,20}};
    	int arrYeni []= new int [arr1.length];
    	
    	
    	for (int kat = 0; kat < arr1.length; kat++) {
			
    		for (int daire = 0; daire < arr1[kat].length; daire++) {
				arrYeni[kat]+=arr1[kat][daire];
    			
			}
		}
    	
    	System.out.println(Arrays.toString(arrYeni));

    }
}
