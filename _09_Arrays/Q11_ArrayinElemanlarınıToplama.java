package _09_Arrays;

public class Q11_ArrayinElemanlarýnýToplama {

	public static void main(String[] args) {
		// arr1 = { {1,2}, {3,4,5}, {6} }  ve  arr2 = { {7,8,9}, {10,11}, {12} }  veriliyor.
		// Bu iki array'in tum elemanlarinin toplamini bulan programi yaziniz.
		

		int arr1 [][] = { {1,2}, {3,4,5}, {6} };
		int arr2 [][]= { {7,8,9}, {10,11}, {12} };
		
		//arr1 için;
		
		int sum1=0;
		
		for (int outer = 0; outer < arr1.length; outer++) {
			for (int inner = 0; inner < arr1[outer].length; inner++) {
				sum1+=arr1[outer][inner];
			}
		}
		
		System.out.println("Arr1 toplamý : " + sum1);
		
		//arr2 için
		int sum2=0;
		
		for (int outer = 0; outer < arr2.length; outer++) {
			for (int inner = 0; inner < arr2[outer].length; inner++) {
				sum2+=arr2[outer][inner];
			}
		}
		
		System.out.println("Arr2 toplamý : " + sum2);
		System.out.println("Arraylerin toplamý : " + (sum1+sum2));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*int sum1=0;
		for (int dýs = 0; dýs < arr1.length; dýs++) {
			for (int ic = 0; ic < arr1[dýs].length; ic++) {
				sum1+=arr1[dýs][ic];
			}
		}
		System.out.println("ilk arrayin toplamý : " + sum1);
		
		int sum2=0;
		
		for (int dýs = 0; dýs < arr2.length; dýs++) {
			for (int ic = 0; ic < arr2[dýs].length; ic++) {
				sum2+=arr2[dýs][ic];
			}
		}
		System.out.println("ikinci arrayin toplamý : " + sum2);
		System.out.println("arr1+arr2 = "+ (sum1+sum2));*/
	
	}
	

}
