package _00Day01;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		//kullanýcýnýn ad soyad yaþ boy kilosunu altalta yazdiriniz
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Adýnýzý girin:");
		String name=scan.nextLine();  //girilen veriyi ayný satýra yazdýrýr ln eklenirse bir alt satýra yazdýrýr
		
		System.out.print("Soyadýnýzý girin:");
		String surname=scan.nextLine();
		
		System.out.print("Yaþýnýzý girin:");
		int age=scan.nextInt();
		
		System.out.print("Boyunuzu girin:");
		int height=scan.nextInt();
		
		System.out.print("Kilonuzu girin:");
		int weight=scan.nextInt();
		
		System.out.println("Benim adým:"+name+"\n"
		+"Soyadým:"+surname+"\n"
		+"Yaþým:"+age+"\n"
		+"Boyum:"+height+"cm"+"\n"
		+"Kilom:"+weight+"kg"+"\n");
		
	scan.close();
		
		
		
	}

}
