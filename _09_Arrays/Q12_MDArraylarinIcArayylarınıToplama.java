package _09_Arrays;

import java.util.Arrays;

public class Q12_MDArraylarinIcArayylar�n�Toplama {

	public static void main(String[] args) {
	//A�a��daki multi dimensional arrayin in i� array’lerindeki tum elemanlar�n 
	//toplam�n� birer birer bulan ve herbir sonucu yeni bir array’in eleman� yapan
	// ve yeni array’i ekrana yazd�ran bir program yaz�n�z  
	// Ornegin; { {1,2,3}, {4,5}, {6,7} } ==> 1+2+3=6  4+5=9  6+7=13 ==> output: {6, 9, 13}  
			
		int arr [][]= { {1,2,3}, {4,5}, {6,7} };
		
		int arrToplam []= new int [arr.length];
		
		int sum=0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum+=arr[i][j];
			}
			arrToplam[i]=sum;
			sum=0;
		}
		
		System.out.println("Yeni Array : " + Arrays.toString(arrToplam));
		
		
	}
}
