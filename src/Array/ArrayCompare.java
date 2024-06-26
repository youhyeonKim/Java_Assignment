package Array;

import java.util.Arrays;

public class ArrayCompare {

  public static void main(String[] args) {
      int[] a = {1, 2, 3, 4};
      int[] b = {1, 2, 3, 4};
      int[] c = {1, 5, 3, 4};
      ArrayCompare p = new ArrayCompare();
      p.equalsArray(a, b);
      p.equalsArray(a, c);
  }
  public void equalsArray(int[] a, int[] b) {
    boolean check = true;
    Arrays.sort(a);
    Arrays.sort(b);
    if (a.length != b.length) {
      System.out.println("two array not-equals");
      check = false;
    }
    else {
      for (int i = 0; i < a.length; i++) {
        if (a[i] != b[i]) {
          check = false;
          break;
        }
      }
    }
    if (check) {
      System.out.println("two array equals");
    }
    else
      System.out.println("two array not-equals");
  }
}
