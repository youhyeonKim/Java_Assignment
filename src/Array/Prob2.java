package Array;

public class Prob2 {

  public static void main(String[] args) {
    System.out.println("<<   생성된 난수   >>");
    Prob2 p2 = new Prob2();
    int[] numbers = p2.getgenerateRandom();
    for (int n : numbers) {
      System.out.print(n+",\t");
    }
    System.out.println();
    System.out.println("====================");
    System.out.println("배열에서 가장 큰 숫자: "+p2.getMaxnum(numbers));

  }
  public int[] getgenerateRandom(){
    int[] rand_numbers = new int[10];
    for(int i=0; i<rand_numbers.length; i++){
      rand_numbers[i] = (int)(Math.random()*30)+1;
    }
   return rand_numbers;
  }
  public int getMaxnum(int[] numbers){
    int max = 0;
    for(int i=0; i<numbers.length; i++){
      if(max<numbers[i]){
        max = numbers[i];
      }
    }
    return max;
  }
}
