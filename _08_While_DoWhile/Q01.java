package _08_While_DoWhile;

public class Q01 {

	public static void main(String[] args) {
        // verilen bir sayinin Armstrong sayi olup olmadigini kontrol eden code yazin
        // Armstrong sayi rakamlarinin kuplerinin toplamina esit olan sayidir
        // 153 = (1*1*1) + (5*5*5) + (3*3*3) gibi

		int say� = 153;
		int a=say�;
		
		int kup=0;
		
		while (a>0) {
			kup+=(a%10)*(a%10)*(a%10);
			a/=10;
		}
			System.out.println(kup);
		
			
		if (kup==say�) {
			System.out.println("Armstrong say�");
		} else {
			System.out.println("Armstron say� de�il");
		}
			
	}

}
