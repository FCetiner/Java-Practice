package _09_Arrays;

public class Q15 {

	public static void main(String[] args) {
		/*
        check your array's first and last elements are same
        (dizinizin ilk ve son elemanlar�n�n ayni olup olmad���n� kontrol eden kod yaziniz
        int []arr={2,6,4,8,2,6,2};
         */

		int arr[]={2,6,4,8,2,6,2};
		
		
		arr[0]=2;
		arr[arr.length-1]=2;
		boolean ayn�M�=false;
		if (arr[0]==arr[arr.length-1]) {
			ayn�M�=true;
		} else {
			ayn�M�=false;
		}
	
		System.out.println(ayn�M�);
		
		
	}

}
