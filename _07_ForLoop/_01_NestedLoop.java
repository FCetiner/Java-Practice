package _07_ForLoop;

public class _01_NestedLoop {

    public static void main(String[] args) {

         //E�er bir d�ng�n�n g�vdesinde di�er bir d�ng� bulunuyorsa,
         //Bu t�r d�ng�ler i�-i�e d�ng�ler olarak bilinir
         //i�teki d�ng� d��taki d�ng�n�n her ad�m�nda yeniden �al��t�r�lacakt�r
         //i� i�e d�ng�lerde en i�teki d�ng� en �nce tamamlan�r.


        for (int i = 1; i <=10 ; i++) {

            System.out.println("dis dongu i = "+ i);

            for (int j = 0; j < 5 ; j++) {

                System.out.println("ic dongu i ="+ i + " j = "+ j);


            }

            System.out.println();
        }


        int deger = 0;

        for (int i = 1; i <=10 ; i++) {

            for (int j = 1; j <=5; j++) {

                deger+=1;
            }
        }
        System.out.println("deger = " + deger);


         deger=0;

        for (int i = 1; i <=10 ; i++) {                 // i    j   deger
                                                        // 1    1     1
            for (int j = 1; j <= i ; j++) {             // 2    1     2
                deger+=1;                               // 2    2     3
            }                                           // 3    1     4
        }                                               // 3    2     5
        System.out.println("deger = " + deger);         // 3    3     6

    // 1+2+3+4+.....+10 =55


    }


}
