package _00Day01;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		//kullan�c�n�n ad soyad ya� boy kilosunu altalta yazdiriniz
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Ad�n�z� girin:");
		String name=scan.nextLine();  //girilen veriyi ayn� sat�ra yazd�r�r ln eklenirse bir alt sat�ra yazd�r�r
		
		System.out.print("Soyad�n�z� girin:");
		String surname=scan.nextLine();
		
		System.out.print("Ya��n�z� girin:");
		int age=scan.nextInt();
		
		System.out.print("Boyunuzu girin:");
		int height=scan.nextInt();
		
		System.out.print("Kilonuzu girin:");
		int weight=scan.nextInt();
		
		System.out.println("Benim ad�m:"+name+"\n"
		+"Soyad�m:"+surname+"\n"
		+"Ya��m:"+age+"\n"
		+"Boyum:"+height+"cm"+"\n"
		+"Kilom:"+weight+"kg"+"\n");
		
	scan.close();
		
		
		
	}

}
