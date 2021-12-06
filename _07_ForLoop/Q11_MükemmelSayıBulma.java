package _07_ForLoop;

import java.util.Scanner;

public class Q11_MükemmelSayýBulma {
public static void main(String[] args) {
         /*
        Bir sayinin mükemmel olup olmadiðini bulan bir method yaziniz.
        Mükemmel sayi : bir sayinin kendisi hariç bölenlerinin toplamý, kendisine eþitse o sayi mükemmeldir.
        ORNEK:
        INPUT     : 6
        OUTPUT : 1,2,3
                      1+2+3 = 6 = 6 (Mükemmel)

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
		System.out.println("Lütfen bir sayý girin:");
		int sayý=scan.nextInt();
		
		
		mukemmelsayýbul(sayý);
		
		   	
    	
    	scan.close();
    	

    }

private static void mukemmelsayýbul(int sayý) {
	int toplam=0;
	
	for (int i = 1; i < sayý; i++) {
		if (sayý%i==0) {
			System.out.println("Sayýnýn bölenleri : " + i);
		toplam+=i;
		}
	}

	if (sayý==toplam) {
		System.out.println(sayý +" Çok mükemmel bir sayý");
	} else {
		System.out.println(sayý + " O kadarda mükemmel bir sayý deðil");
	}
	*/
	
}


}
