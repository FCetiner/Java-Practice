package _05_StringManipulation;

public class Q05 {
    public static void main(String[] args) {
    /*String seklinde verilen asagidaki fiyatlarin toplamini bulunuz.
     * String  str 1= %13.99
     * String str 2= %10.55
     * ipucu: Double.parseDouble() methodunu kullanabilirsiniz.*/

    	String  str1= "$3.99";
    	String str2= "$10.55";
    	
    	str1=str1.replaceAll("\\W","");
    	str2=str2.replaceAll("\\W","");
    	
    	double say�1 = Double.parseDouble(str1)/100;
    	double say�2 = Double.parseDouble(str2)/100;
    	
    	System.out.println("Fiyatlar�n toplam�:"+ (say�1+say�2));
    }
}
