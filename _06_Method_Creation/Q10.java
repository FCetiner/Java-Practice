package _06_Method_Creation;

import java.util.Scanner;

public class Q10 {
public static void main(String[] args) {
    /*
     Problem Tanýmý :
        powerOfThree isminde bir method oluþturun.
        Parametre olarak int
        Return tipi boolean
        Bir tamsayý verildiðinde, 3 üssü olup olmadýðýný teyit edin. 3'ün üssü(kuvveti) ise true, deðilse false döndürün.
        örnek 1:
        Girdi: 27
        çýktý: true
        Açýklama: 3*3*3 =27
        Sonuç= true

        örnek 2:
        Girdi: 0
        çýktý: false
        örnek 3:
        Girdi: 9
        çýktý: true
        Açýklama: 3*3 = 9
        Sonuç= true

        örnek 4:
        Girdi: 45
        çýktý:: false
        Açýklama: 3*3*3*3 =81
        Sonuç= false
        45, 3ün üssü (kuvveti) deðildir.
     */

    	Scanner scan= new Scanner(System.in);
    	System.out.print("Bir tam sayý girin: ");
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
