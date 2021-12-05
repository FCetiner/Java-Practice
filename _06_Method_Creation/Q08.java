package _06_Method_Creation;

import java.util.Scanner;

public class Q08 {
 public static void main(String[] args) {
	 /*
    Problem tan�m�:
    Kullan�c�dan ald���n�z bir String'deki kelimeleri sondan ba�a do�ru yerle�tiren
    String parametreli return type li reverseWord isminde bir method yaz�n�z

     Test DAta :
    input : Allah Javac� arkada�lara  zihin a��kl��� versin
    Output : versin a��kl��� zihin arkada�lara Javac� Allah
     */
	 Scanner scan = new Scanner(System.in);
     System.out.print("Cumle giriniz: ");
     String str = scan.nextLine();

     System.out.println(reverseWord(str));
scan.close();
 }

 public static String reverseWord(String str) {

     String[] arr = str.trim().split(" ");//split: her " " space den sonra her eleman� virg�lle ay�r�r.

     String strTers = "";

     for (int i = arr.length - 1; i >= 0; i--) {

         strTers += arr[i] + " ";
     }

     return strTers.trim();
 }
}