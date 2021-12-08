package _09_Arrays;

import java.util.Arrays;

public class Q10 {

	public static void main(String[] args) {
		/*  you have a string "GayetBasarýlý"
	        * with arrays change it to "CoookBasarýlý" and write changing array
			*(String iniz: "GayetBasarýlý"  Diziyi "CoookBasarýlý" ye cevirin )
			*
			*/
		
		String str = "GayetBasarýlý";
		str=str.replace("Gayet","Coook");
		
		String arr [] = new String [1];
		
		arr[0]=str;
		System.out.println(Arrays.toString(arr));
		
	}

}
