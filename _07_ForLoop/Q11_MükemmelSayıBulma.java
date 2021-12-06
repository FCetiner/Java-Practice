package _07_ForLoop;

import java.util.Scanner;

public class Q11_M�kemmelSay�Bulma {
public static void main(String[] args) {
         /*
        Bir sayinin m�kemmel olup olmadi�ini bulan bir method yaziniz.
        M�kemmel sayi : bir sayinin kendisi hari� b�lenlerinin toplam�, kendisine e�itse o sayi m�kemmeldir.
        ORNEK:
        INPUT     : 6
        OUTPUT : 1,2,3
                      1+2+3 = 6 = 6 (M�kemmel)

                      mukemmel sayi kontrolu
                      1. kullanicidan sayi alalim
                      2. bir toplam degiskeni olusturuyoruz
                      3. sayinin bolenleri bul
                      4. bolenleri toplamla topla
                      5. sayiyla toplamin esitligini kontrol et

        */
		
	Scanner scan = new Scanner(System.in);
    System.out.print("Lutfen bir sayi giriniz : ");
    int sayi = scan.nextInt();

    System.out.println(checkPerfectNumber(sayi));
    boolean flag;
    flag = checkPerfectNumber(sayi);
    System.out.println(flag);

    String result = checkPerfectNumber(sayi) ? "Sayi mukemmel sayidir"
            : "Sayi mukemmel sayi degildir";
    System.out.println(result);
    scan.close();
}

	public static boolean checkPerfectNumber(int sayi) {
    int toplam = 0;
    boolean flag = false; // durum kontrolu (acik kapali gibi) "flag ismi bir onem arzetmiyor"
    for (int i = 1; i < sayi; i++) {
        if (sayi % i == 0) {
            toplam = toplam + i; // toplam += i;
        }
    }
    if (toplam == sayi) {
        flag = true;
    }

    return flag;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		/*Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen bir say� girin:");
		int say�=scan.nextInt();
		
		
		mukemmelsay�bul(say�);
		
		   	
    	
    	scan.close();
    	

    }

private static void mukemmelsay�bul(int say�) {
	int toplam=0;
	
	for (int i = 1; i < say�; i++) {
		if (say�%i==0) {
			System.out.println("Say�n�n b�lenleri : " + i);
		toplam+=i;
		}
	}

	if (say�==toplam) {
		System.out.println(say� +" �ok m�kemmel bir say�");
	} else {
		System.out.println(say� + " O kadarda m�kemmel bir say� de�il");
	}
	*/
	
}


}
