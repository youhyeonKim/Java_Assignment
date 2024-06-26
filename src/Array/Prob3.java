package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Prob3 {

  public static void main(String[] args) {
    int[] numbers;
    int num;
    Scanner sc = new Scanner(System.in);
    System.out.print("입력받을 숫자 개수: ");
    num = sc.nextInt();
    numbers = new int[num];
    for(int i=0; i<num; i++){
      numbers[i] = sc.nextInt();
    }
    Prob3.printUniqueNumber(numbers);
  }
  private static void printUniqueNumber(int[] array){
    Arrays.sort(array);
    int check = 0;
    for(int n:array){
      if(check!=n)
        System.out.print(n+ " ");
      check = n;
    }


  }


}
