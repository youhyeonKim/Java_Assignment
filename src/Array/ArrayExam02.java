package Array;

import java.util.Random;

public class ArrayExam02 {

  public static void main(String[] args) {
    int[] numbers = new int [5];
    Random r = new Random();
    for(int i=0; i<numbers.length; i++){
      numbers[i] = r.nextInt(100)+1;
      System.out.print(numbers[i]+" ");
    }

  }


}
