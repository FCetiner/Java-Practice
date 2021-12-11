package _12_Varargs;

public class Q02 {
	public static void main(String[] args) {
// verilen int lerden ilki haric tum sayilari toplayan ve
// buldugunuz toplam ile ilk sayiyi carpip sonucu yazdiriniz.

		
		
		topla(2,1,2,2);
		
	}

	public static void topla(int carpýlacakSayý, int... toplanacakSayýlar ) {
		int toplam=0;
		
		for(int w: toplanacakSayýlar) {
		toplam+=w;
		}
		
		System.out.println(toplam*carpýlacakSayý);
	}
	
	
	
}
