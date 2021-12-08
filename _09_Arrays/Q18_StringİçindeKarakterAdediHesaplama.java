package _09_Arrays;



public class Q18_String��indeKarakterAdediHesaplama {
    public static void main(String[] args) {
        // kullan�c�dan al�nan bir  String'deki herbir  karakterin adedini bir array i�inde yazd�ran bir java program� yaz�n.
        // String  "Javacilar cook afilli" ise cevap ��ylryle olmal�d�r:
        // { =2, a=3, r=1, c=1, v=1, o=2, f=1, l=2, J=1, i=2}

    	  String str = "Javacilar cook afilli";

          int count[] = new int[256];		// 256 farkl� karakter olabilir bu yuzden 256 uzunlu�unda dizin olu�tu

          for (int i = 0; i < str.length(); i++) {

              count[str.charAt(i)]++;
          }
          char ch[] = new char[str.length()];

          for (int i = 0; i < str.length(); i++) {
              ch[i] = str.charAt(i);

              int find = 0;

              for (int j = 0; j <= i; j++) {
                  // If any matches found:Herhangi bir e�le�me bulunursa

                  if (str.charAt(i) == ch[j])
                      find++;
              }

              if (find == 1)
                  System.out.print(str.charAt(i) + " = " + count[str.charAt(i)] + ",  ");
          }
      }
  }