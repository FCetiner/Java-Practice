package _00Day01;

public class Q01 {

	public static void main(String[] args) {
		// verilen 12345 yukar�dan a�a�� d�ru yaz�n�z
		
		int say� =12345;
		
		int birler= say�%10;
		int onlar= (say�/10)%10;
		int y�zler =(say�/100)%10;
		int binler= (say�/1000)%10;
		int onbinler=say�/10000;
		
		System.out.println(onbinler);
		System.out.println(binler);
		System.out.println(y�zler);		
		System.out.println(onlar);
		System.out.println(birler);
		
		//tek sat�rda yazmak istersek, konsolda alt sat�rda yazmak i�in "\n" kullan�l�r
		
		System.out.println(onbinler+"\n"+binler+"\n"+y�zler+"\n"+onlar+"\n"+birler+"\n");

	
	
	
	}
	
	

}
