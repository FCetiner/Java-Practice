package _13_stringBuilder;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
		/*
		Bir cümleyi parametre olarak kabul eden, StringBuilder kullanarak cümleyi ters çeviren ve cümlenin palindrom
	        olup olmadýðýný kontrol eden (büyük/küçük harf duyarlýlýðý olmadan) bir Java programý yazýn.
	     (without case sensitivity)
	     Eg : input : I love Java
	     Output: "Reversed sentence : avaJ evol I 
	        It is not a palindrome"

		 */
    	Scanner scan = new Scanner(System.in);
    	System.out.println("bir metin giriniz");
    	String metin=scan.nextLine();
    	StringBuilder sb = new StringBuilder (metin);
    	
    	//sb.append(metin); olarak da ekleyebilirdir
    	//StringBuilder sb = new StringBuilder (scan.nextLine());
    	
    	String tersMetin = sb.reverse().toString();//Burada method coini zinciri var
    	
    	if(tersMetin.equalsIgnoreCase(metin)) {
    		System.out.println("girilen metin polindrome ifadedir : " + tersMetin);
    	} else {
    		System.out.println("girilen metin polindrome ifade deðildir : " + tersMetin);
    		   
    	}
    	
    scan.close();	
    }

}
