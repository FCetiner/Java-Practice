package _05_StringManipulation;

public class Q09 {

    public static void main(String[] args) {

		/*
				StringMethods:
				cift uzunlukta bir degiskenin ilk yarisini konsolda yazdirmak icin bir Java programi yaziniz.
	    	    ORNEK:
		     	INPUT      : Python
				OUTPUT :   Pyt
	    */
       
    	String str = "Python";
    	if (str.length()%2==0) {
			System.out.println(str.substring(0,(str.length())/2));
		}
    	
   
    }
}
