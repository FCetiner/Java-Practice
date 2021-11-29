package _00Day01;

public class Q01 {

	public static void main(String[] args) {
		// verilen 12345 yukarýdan aþaðý dðru yazýnýz
		
		int sayý =12345;
		
		int birler= sayý%10;
		int onlar= (sayý/10)%10;
		int yüzler =(sayý/100)%10;
		int binler= (sayý/1000)%10;
		int onbinler=sayý/10000;
		
		System.out.println(onbinler);
		System.out.println(binler);
		System.out.println(yüzler);		
		System.out.println(onlar);
		System.out.println(birler);
		
		//tek satýrda yazmak istersek, konsolda alt satýrda yazmak için "\n" kullanýlýr
		
		System.out.println(onbinler+"\n"+binler+"\n"+yüzler+"\n"+onlar+"\n"+birler+"\n");

	
	
	
	}
	
	

}
