package Lambda_Stream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class LmabdaStreamEx01 {

  public static void main(String[] args) {
    //1.
    Supplier<String> supplier = String::new;
    //2.
    Supplier<Random> supplier1 = Random::new;
    //3.
    try {
      FileInputStream fs = new FileInputStream("C:/Test_file_with_java/data.txt");
      BufferedReader br = new BufferedReader(new InputStreamReader(fs));
      String line;
      int count = 0;
      while((line=br.readLine())!=null){
        count++;
      }
    } catch (IOException e) {
      System.err.println(e.getMessage());
    }

    //4.
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    int sum = numbers.stream().mapToInt(i->i).sum();
    System.out.println(sum);

    //5.
    List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    int even_doubled_sum = numbers1.stream().filter(num->num%2!=0).mapToInt(i->i*i).sum();
    System.out.println(even_doubled_sum);

  }

}
