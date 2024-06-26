package Array;

import java.util.Arrays;

public class Prob5 {

  public static void main(String[] args) {
    Prob5 p = new Prob5();
    int[] numbers = {3, 4 ,1, 90};
    System.out.println("최대값: "+p.getValue(numbers, true));
    System.out.println("최소값: "+p.getValue(numbers, false));
  }
  public int getValue(int[] numbers, boolean isMax){
    Arrays.sort(numbers);
    if(isMax)
      return numbers[numbers.length-1];
    else
      return numbers[0];
  }

}
