package _08_While_DoWhile;

public class Q01 {

	public static void main(String[] args) {
        // verilen bir sayinin Armstrong sayi olup olmadigini kontrol eden code yazin
        // Armstrong sayi rakamlarinin kuplerinin toplamina esit olan sayidir
        // 153 = (1*1*1) + (5*5*5) + (3*3*3) gibi

		int sayý = 153;
		int a=sayý;
		
		int kup=0;
		
		while (a>0) {
			kup+=(a%10)*(a%10)*(a%10);
			a/=10;
		}
			System.out.println(kup);
		
			
		if (kup==sayý) {
			System.out.println("Armstrong sayý");
		} else {
			System.out.println("Armstron sayý deðil");
		}
			
	}

}
