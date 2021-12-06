package _07_ForLoop;

import java.util.Scanner;

public class Q08_Palindrome {
    public static void main(String[] args) {
        // Kullanicidan bir String isteyin. Kullanicinin girdigi
        // Stringâ€™in palindrome olup olmadigini kontrol eden bir program yazin.

        Scanner scan=new Scanner(System.in);
        System.out.println("kelime girin");
        String kelime=scan.next();
        String ters="";
        
        for (int i = kelime.length()-1; i >=0; i--) {
			ters+=kelime.charAt(i) ;
		}
        if (kelime.contains(ters)) {
			System.out.println("girilen kelime pandomim");
		} else {
			System.out.println("Girilen kelime pandomim deðil");
		}
               
        
       System.out.println( "Girilen kelimenin tersten yazýlýþý " +ters);
   
    scan.close();
    }

}

