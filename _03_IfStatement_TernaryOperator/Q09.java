package _03_IfStatement_TernaryOperator;

public class Q09 {

    public static void main(String[] args) {

       /*   45 değerinde bir double oluşturun.
            e�er double 5'e b�l�n�nce kalan 0 ise ve double 8'e b�l�n�nce kalan 0 ise
            "able to divide by 5 and 8" yazd�r�n�z

            Eğer double 10'a b�l�n�nce kalan 5 ise ve double 9'a bölününce kalan 0 ise
            "able to divide by 9 and divide by 10 reminder is 5" yazdırınız.
        */

    	double say�= 45;
    	
    	if ((say�%5==0) && (say�%8==0) ) {
			System.out.println("able to divide by 5 and 8");
		} 
    	
    	if (say�%10==5 && say�%9==0) {
			System.out.println("able to divide by 9 and divide by 10 reminder is 5");
		}
    }
    
    
}
