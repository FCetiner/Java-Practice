package _06_Method_Creation;

import java.util.Scanner;

public class Q08 {
 public static void main(String[] args) {
	 /*
    Problem tanımı:
    Kullanıcıdan aldığınız bir String'deki kelimeleri sondan başa doğru yerleştiren
    String parametreli return type li reverseWord isminde bir method yazınız

     Test DAta :
    input : Allah Javacı arkadaşlara  zihin açıklığı versin
    Output : versin açıklığı zihin arkadaşlara Javacı Allah
     */
	 Scanner scan = new Scanner(System.in);
     System.out.print("Cumle giriniz: ");
     String str = scan.nextLine();

     System.out.println(reverseWord(str));
scan.close();
 }

 public static String reverseWord(String str) {

     String[] arr = str.trim().split(" ");//split: her " " space den sonra her elemanı virgülle ayırır.

     String strTers = "";

     for (int i = arr.length - 1; i >= 0; i--) {

         strTers += arr[i] + " ";
     }

     return strTers.trim();
 }
}