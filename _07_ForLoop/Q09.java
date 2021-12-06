package _07_ForLoop;

public class Q09 {

    public static void main(String[] args) {
        // 1 x 1 = 1
        // 1 x 2 = 2
        // 1 x 3 = 3
        // 1 x 4 = 4
        // 1 x 5 = 5
        // 1 x 6 = 6
        // 1 x 7 = 7
        // 1 x 8 = 8
        // 1 x 9 = 9
        // 1 x 10 = 10
        // Yuarýdaki çarpým tablosunu 10 a kadar ekrana yazdýrýnýz.


    	for (int satýr = 1; satýr <=10; satýr++) {
			for (int sutun = 1; sutun <=10; ) {
				System.out.print(satýr + " * " + sutun + " = " + satýr*sutun);
				break;
			}
		System.out.println();
    	}
       

    }
}
