package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SortUtil {

  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("입력배열 int[] inputNumber: ");
    String s = bf.readLine();
    String[] numbers = s.split(",");
    int[] numbers_s = new int[numbers.length];
    for(int i=0; i<numbers_s.length; i++){
      numbers_s[i] = Integer.parseInt(numbers[i]);
    }
    SortUtil p = new SortUtil();
    System.out.print("리턴값: "+ Arrays.toString(p.ascending(numbers_s)));
  }
  int[] ascending(int[] inputNumbers){
    int temp = 0;
    for(int i=0; i<inputNumbers.length-1; i++){
      for(int j=i+1; j<inputNumbers.length; j++){
        if(inputNumbers[j]<inputNumbers[i]){
          temp = inputNumbers[j];
          inputNumbers[j] = inputNumbers[i];
          inputNumbers[i] = temp;
        }
      }
    }
    return  inputNumbers;
  }

}
