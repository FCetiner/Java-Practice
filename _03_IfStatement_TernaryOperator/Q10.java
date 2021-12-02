package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {

    	/* Problem tanimi : Kulanicidan aracacinin hizini aliniz Trafik cezasinin
         * degerini hesaplayin. 45 hiz siniridir. 
         * Eger Hiziniz 55-74 arasinda ise: Ceza 100 $'dir.
         * Eger Hiziniz 75 - 84 arasinda ise: Ceza 150 $'dir.
         * Eger Hiziniz 85 -94 arainda ise: Ceza 320 $'dir.
         * Eger Hiziniz 94'den daha fazla ise: Ceza 500 $'dir.
         * Eger kullanicinin ehliyeti yoksa cezaya 200 $ eklenir.
         * orn: Hiziniz 77 iken cezaniz 150$'dir ama ehliyetiniz yoksa ceza 350 $ olur.
         * -----------------------------------------
         * Orn;
         * currentSpeed(Hiziniz) 87 ve isDriverLicenceAvailable(Ehliyeti var mi) = true;
         * sonuc 320 olmalidir.
         * currentSpeed(Hiziniz) 65 ve isDriverLicenceAvailable(Ehliyeti var mı?) =
         * false; sonuc 300 olmalidir.
         */

    	Scanner scan = new Scanner (System.in);
    	System.out.println("Arac�n�z�n h�z�n� giriniz:");
    	double h�z = scan.nextDouble();
    	System.out.println("Ehliyetiniz var ise E yok ise H giriniz");
    	char ehliyet = scan.next().toUpperCase().charAt(0);
    	
    	if (ehliyet == 'E') {
			if (h�z<55) {
				System.out.println("Herhangi bir cezan�z yoktur");
			} else if(h�z<75){
				System.out.println("Cezan�z 100 TL");
			}else if(h�z<85){
				System.out.println("Cezan�z 150 TL");
			}else if(h�z< 95){
				System.out.println("Cezan�z 320 TL");
			}else if(h�z>=95){
				System.out.println("Cezan�z 500 TL");
			}
			else {
				System.out.println("Te�ekk�rler");
			}
    	
    	} else if (ehliyet=='H'){

    		if (h�z<55) {
				System.out.println("Cezan�z 200 TL");
			} else if(h�z<75){
				System.out.println("Cezan�z 300 TL");
			}else if(h�z<85){
				System.out.println("Cezan�z 450 TL");
			}else if(h�z< 95){
				System.out.println("Cezan�z 520 TL");
			}else if(h�z>=95){
				System.out.println("Cezan�z 700 TL");
			}
			else {
				System.out.println("Te�ekk�rler");
			}
		}
    	
    	scan.close();
    	
    }
}
