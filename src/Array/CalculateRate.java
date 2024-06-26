package Array;

import javax.xml.transform.Source;

public class CalculateRate {

  public static void main(String[] args) {
    CalculateRate c= new CalculateRate();
    int[] n = {10, 30, 20,50,80};
    c.calculate(n);
  }
  void calculate(int[] nums){
    double[] num_ratse = new double[nums.length];
    int sum = 0;
    int num = 0;
    for(int n:nums){
      sum += n;
    }
    for(int i=0; i<nums.length;i++){
      num_ratse[i] = Math.round((nums[i]*1.0/sum)*100)*1/1.0;

      num = (int)num_ratse[i];
      for(int j=0; j<num; j++){
        System.out.print("*");
      }
      System.out.printf("( %.1f %%)", num_ratse[i]);
      System.out.println();
    }
  }

}
