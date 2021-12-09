package _10_List;



public class Q07_ArraySimetrikMi_Ayna {

	public static void main(String[] args) {
		/*
		 * ayna check sorusu: input : int arr1[] = { 1, 2, 3, 4, 4, 3, 2, 1 }; output :
		 * verilen array simetriktir
		 */
		
		int arr[] = { 1, 2, 3, 4, 4, 3, 2, 1 };
		boolean simetrik = false;
		//int count=0;
		
		for (int i = 0; i < arr.length/2; i++) {
			if (arr[i]==arr[arr.length-1-i]) {
				simetrik=true;
				// count++;
			} else {
				simetrik=false;
				break;
			}
			
		}
		System.out.println(simetrik);
			/*if (count==arr.length/2) {
			System.out.println("simetrik");
		} else {
			System.out.println("simetrik deðil");
		}*/
			
	}

}
