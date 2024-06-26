package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.*;
import javax.xml.transform.Source;

public class Prob6 {

  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("input: ");
    String arr = bf.readLine();
    String[] numbers = arr.split(",");
    int[] numbers_r = new int[numbers.length];
    for (int i=0; i<numbers_r.length; i++){
      numbers_r[i] = Integer.parseInt(numbers[i]);
    }
    Prob6 p6= new Prob6();
    System.out.print("median: "+ p6.findMedian(numbers_r));
  }
  public int findMedian(int[] values){
    int median = 0;
    int sum = 0;
    int avg = 0;
    int[] diff = new int[values.length];
    Arrays.sort(values);
    System.out.println(Arrays.toString(values));
    //평균 구하기
    for(int n:values){
      sum += n;
    }
    avg = (int)(sum/values.length);
    System.out.println(avg);
    //평균과의 차이 구하기
    for(int i=0; i<diff.length; i++){
      diff[i] = values[i] - avg;
    }
    System.out.println(Arrays.toString(diff));
    int check = 0;
    int min_idx = 0;
    int min = Math.abs(diff[0]);
    for(int i=1; i<diff.length; i++){
      if(Math.abs(diff[i])<min){
        min = Math.abs(diff[i]);
        min_idx = i;
      }
    }
    System.out.println(min);
    return values[min_idx];

  }

}
