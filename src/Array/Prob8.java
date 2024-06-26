package Array;

public class Prob8 {

  public static void main(String[] args) {
    int[][] numbers = {
        {5, 4, 3, 2, 1},
        {10, 9, 8, 7, 6},
        {15, 14, 13, 12, 11},
        {20, 19, 18, 17, 16},
        {25, 24, 23, 22, 21}
    };
    for(int[] n1: numbers){
      for(int n2:n1){
        System.out.printf("%d, ", n2);
      }
    }
  }


}
