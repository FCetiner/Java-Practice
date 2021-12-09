package _10_List;


import java.util.ArrayList;

public class Q10 {
    /*
     * If the array is { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
     * type a program to create a new array whose elements are like {3, 5+1, 2+7+9, 2+3+5+7}
     */
    public static void main(String[] args) {

    	  String arr[] = {"3", "5", "1", "2", "7", "9", "2", "3", "5", "7",};
          //3, 5+1, 2+7+9, 2+3+5+7

          System.out.println(buNasilMethod(arr).toString().replace("+,",",").replace("+]", "]"));
      }

      public static ArrayList<String> buNasilMethod(String[] arr) {
          ArrayList<String> list = new ArrayList<>();
          int count = 0;
          int kullanilan = 1;
          while (arr.length - kullanilan >= count) {
              String toplam = "";
              for (int i = 0; i <= count; i++) {
                  toplam += arr[kullanilan - 1 + i] + "+";
                 
              }
              count++;
              kullanilan += count;
              list.add(toplam);
              
          }
       
          return list;
    }
}
