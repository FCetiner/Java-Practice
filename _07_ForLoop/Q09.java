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
        // Yuar�daki �arp�m tablosunu 10 a kadar ekrana yazd�r�n�z.


    	for (int sat�r = 1; sat�r <=10; sat�r++) {
			for (int sutun = 1; sutun <=10; ) {
				System.out.print(sat�r + " * " + sutun + " = " + sat�r*sutun);
				break;
			}
		System.out.println();
    	}
       

    }
}
