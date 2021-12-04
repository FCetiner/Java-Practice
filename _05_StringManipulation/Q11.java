package _05_StringManipulation;

public class Q11 {
    public static void main(String[] args) {
	/*
		Asagidaki String degiskenini kullanarak  konsolda A L i yazdiriniz.
		String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		 */
    	
    	String picName ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    	char A = picName.charAt(picName.indexOf('A'));
    	char L = picName.charAt(picName.indexOf('L'));
    	char I = picName.charAt(picName.indexOf('I'));
    
    	System.out.println("ALÝ  :" + A +" " + L + " " + I);
    }
    

}
