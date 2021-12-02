package _03_IfStatement_TernaryOperator;

public class Q09 {

    public static void main(String[] args) {

       /*   45 deÄŸerinde bir double oluÅŸturun.
            eğer double 5'e bölününce kalan 0 ise ve double 8'e bölününce kalan 0 ise
            "able to divide by 5 and 8" yazdırınız

            EÄŸer double 10'a bölününce kalan 5 ise ve double 9'a bÃ¶lÃ¼nÃ¼nce kalan 0 ise
            "able to divide by 9 and divide by 10 reminder is 5" yazdÄ±rÄ±nÄ±z.
        */

    	double sayı= 45;
    	
    	if ((sayı%5==0) && (sayı%8==0) ) {
			System.out.println("able to divide by 5 and 8");
		} 
    	
    	if (sayı%10==5 && sayı%9==0) {
			System.out.println("able to divide by 9 and divide by 10 reminder is 5");
		}
    }
    
    
}
