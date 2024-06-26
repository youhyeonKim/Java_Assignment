package Array;

import java.util.*;

public class Prob6 {

  public static void main(String[] args) {

  }
  public void findMedian(int[] values){
    Arrays.sort(values);
    int sum = 0;
    int avg = 0;
    int[] diff_set = new int[values.length];
    for(int n:values){
      sum += n;
    }
    avg = (int)(sum/values.length);
    for(int i=0; i<values.length; i++){
      diff_set[i] = Math.abs(values[i]-avg);
    }
    int max = diff_set[0];
    for(int i=1; i<values.length; i++){
      if(diff_set[i]<max)
        max = diff_set[i];
    }

  }

}
