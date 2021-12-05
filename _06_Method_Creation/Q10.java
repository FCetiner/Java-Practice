package _06_Method_Creation;

import java.util.Scanner;

public class Q10 {
public static void main(String[] args) {
    /*
     Problem Tan�m� :
        powerOfThree isminde bir method olu�turun.
        Parametre olarak int
        Return tipi boolean
        Bir tamsay� verildi�inde, 3 �ss� olup olmad���n� teyit edin. 3'�n �ss�(kuvveti) ise true, de�ilse false d�nd�r�n.
        �rnek 1:
        Girdi: 27
        ��kt�: true
        A��klama: 3*3*3 =27
        Sonu�= true

        �rnek 2:
        Girdi: 0
        ��kt�: false
        �rnek 3:
        Girdi: 9
        ��kt�: true
        A��klama: 3*3 = 9
        Sonu�= true

        �rnek 4:
        Girdi: 45
        ��kt�:: false
        A��klama: 3*3*3*3 =81
        Sonu�= false
        45, 3�n �ss� (kuvveti) de�ildir.
     */

    	Scanner scan= new Scanner(System.in);
    	System.out.print("Bir tam say� girin: ");
    	int a = scan.nextInt();
    	System.out.println(powerOfThree(a));;


scan.close();
}

private static boolean powerOfThree(int a) {
	boolean power=false;
	int carpim=1;
	for (int i = 1; i < a; i++) {
		carpim*=3;
		if (carpim==a) {
			power= true;
			break;
		} 
	}
	return power;

	
	
}
}
