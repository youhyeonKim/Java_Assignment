package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob13 {

  public static void main(String[] args) throws IOException {
    Prob13 p = new Prob13();
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("문자열을 입력하세요: ");
    String s = bf.readLine();
    char[] reverse_char = Prob13.reverseString(s.toCharArray(), 4, 7);
    System.out.println(reverse_char);
  }
  static char[] reverseString(char[] s, int start, int end){
    String full = new String(s);
    String part = full.substring(start, end+1);
    StringBuffer bf = new StringBuffer(part);
    part = bf.reverse().toString();
    System.out.println(part);
    String revers_string = full.substring(0,start) + part + full.substring(end+1);
    return  revers_string.toCharArray();
  }
}
