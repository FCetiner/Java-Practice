package _07_ForLoop;

public class Q02_AsciiDe�erleriniBulma {
    public static void main(String[] args) {


// 0-255 e kadar olan harflerin , say� ve harf de�erini konsola yazd�r�n�z.

   
    	
    	 for (int i = 0; i <= 255; i++) {
			char harf=(char) i; // verable char'dan b�y�k oldu�u i�in data casting komutu ile char'a atand�
		System.out.println(i + "-" + harf);
        
        }

    }
}


