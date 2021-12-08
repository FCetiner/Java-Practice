package _09_Arrays;

import java.util.Arrays;

public class Q12_MDArraylarinIcArayylarınıToplama {

	public static void main(String[] args) {
	//Aşağıdaki multi dimensional arrayin in iç arrayâ€™lerindeki tum elemanların 
	//toplamını birer birer bulan ve herbir sonucu yeni bir arrayâ€™in elemanı yapan
	// ve yeni arrayâ€™i ekrana yazdıran bir program yazınız  
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
