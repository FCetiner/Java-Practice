package _06_Method_Creation;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        /*
         * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
         *
         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false
         */

    	Scanner scan = new Scanner(System.in);
    	System.out.println("Bir metin girin");
    	String str=scan.nextLine();
    	
    	System.out.println(findxyz(str));;
    
    scan.close();
    
    }

	private static Boolean findxyz(String str) {
		if (str.contains("xyz")) {
			return true; 
		} else {
			return false;
		}
		
		/*public static boolean xyzVarmi(String str) {
        boolean flag=false;
        if (str.contains("xyz")) {
            flag=true;
        }
        return flag;
    }*/
		
		
	}

}
