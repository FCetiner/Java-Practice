package _07_ForLoop;

public class Q17 {

    public static void main(String[] args) {

//        1 2 3 4 5 6
//         2 3 4 5 6
//          3 4 5 6
//           4 5 6
//            5 6
//             6       �eklini konsola yazdiriniz.

        		for (int sat�r = 0; sat�r <= 5; sat�r++) {
					for (int i = 1; i <=sat�r; i++) {
						System.out.print(" ");
					}
					for (int sutun = sat�r+1; sutun <=6; sutun++) {
						System.out.print(sutun + " ");
					}System.out.println();
        		
        		}
        
    }
}


