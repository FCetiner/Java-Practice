package _07_ForLoop;

public class Q17 {

    public static void main(String[] args) {

//        1 2 3 4 5 6
//         2 3 4 5 6
//          3 4 5 6
//           4 5 6
//            5 6
//             6       þeklini konsola yazdiriniz.

        		for (int satýr = 0; satýr <= 5; satýr++) {
					for (int i = 1; i <=satýr; i++) {
						System.out.print(" ");
					}
					for (int sutun = satýr+1; sutun <=6; sutun++) {
						System.out.print(sutun + " ");
					}System.out.println();
        		
        		}
        
    }
}


