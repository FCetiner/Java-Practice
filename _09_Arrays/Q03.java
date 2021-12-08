package _09_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q03 {

    public static void main(String[] args) {
        //bir int Array elemanlarinin iþaretini(+-)degistiren  bir method yaziniz.
        // input : 1,2,-3,4,-5,-6
        //output :-1,-2,3,-4,5,6

    	Scanner scan =new Scanner (System.in);
    	System.out.println("Arrayin uzunluðunu girin");
    	int size = scan.nextInt();
    	int arr [] = new int [size];
    	
    	for (int i = 0; i < arr.length; i++) {
			System.out.println("Arrayin elemanlarýný girin : ");
			int a=scan.nextInt();
			arr[i]=a;
		}
    	System.out.println("Girdiðiniz array : " + Arrays.toString(arr));
    	
    	int yeniArr []= new int [arr.length];
    	
    	for (int i = 0; i < arr.length; i++) {
			yeniArr[i] = (arr[i] * -1);
		}
    	
    	System.out.println("Arrayin yeni Hali : " + Arrays.toString(yeniArr));
    	
    	
    	
    	scan.close();
    }


}
