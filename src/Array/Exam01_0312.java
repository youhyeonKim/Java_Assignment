package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam01_0312 {

  public static void main(String[] args) throws IOException {
    RateTest r1 = new RateTest();
    r1.get_rate_numbers();
  }

}
class RateTest{
  public void get_rate_numbers() throws IOException {
    int[] numbers;
    int num = 0;
    int sum = 0;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("입력할 숫자들의 개수를 입력하세요: ");
    numbers = new int[Integer.parseInt(br.readLine())];
    for(int i=0; i<numbers.length; i++){
      System.out.print((i+1)+"번째 숫자: ");
      numbers[i] = Integer.parseInt(br.readLine());
      sum += numbers[i];
    }
    for(int i=0; i<numbers.length; i++){
      //numbers[i] = (numbers[i]/sum) * 100;
      double real_n = (numbers[i]*1.0/sum)*100;
      int n = (int)real_n;
      for(int j=0; j<n; j++){
        System.out.print("*");
      }
      System.out.print("("+real_n+")");
      System.out.println();
    }

  }
}
