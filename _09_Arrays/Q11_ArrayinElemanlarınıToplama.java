package _09_Arrays;

public class Q11_ArrayinElemanlar�n�Toplama {

	public static void main(String[] args) {
		// arr1 = { {1,2}, {3,4,5}, {6} }  ve  arr2 = { {7,8,9}, {10,11}, {12} }  veriliyor.
		// Bu iki array'in tum elemanlarinin toplamini bulan programi yaziniz.
		

		int arr1 [][] = { {1,2}, {3,4,5}, {6} };
		int arr2 [][]= { {7,8,9}, {10,11}, {12} };
		
		//arr1 i�in;
		
		int sum1=0;
		
		for (int outer = 0; outer < arr1.length; outer++) {
			for (int inner = 0; inner < arr1[outer].length; inner++) {
				sum1+=arr1[outer][inner];
			}
		}
		
		System.out.println("Arr1 toplam� : " + sum1);
		
		//arr2 i�in
		int sum2=0;
		
		for (int outer = 0; outer < arr2.length; outer++) {
			for (int inner = 0; inner < arr2[outer].length; inner++) {
				sum2+=arr2[outer][inner];
			}
		}
		
		System.out.println("Arr2 toplam� : " + sum2);
		System.out.println("Arraylerin toplam� : " + (sum1+sum2));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*int sum1=0;
		for (int d�s = 0; d�s < arr1.length; d�s++) {
			for (int ic = 0; ic < arr1[d�s].length; ic++) {
				sum1+=arr1[d�s][ic];
			}
		}
		System.out.println("ilk arrayin toplam� : " + sum1);
		
		int sum2=0;
		
		for (int d�s = 0; d�s < arr2.length; d�s++) {
			for (int ic = 0; ic < arr2[d�s].length; ic++) {
				sum2+=arr2[d�s][ic];
			}
		}
		System.out.println("ikinci arrayin toplam� : " + sum2);
		System.out.println("arr1+arr2 = "+ (sum1+sum2));*/
	
	}
	

}
