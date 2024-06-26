package Array;

public class Exam02_0312 {

  public static void main(String[] args) {
    char[][] alphabet = new char[5][5];
    char start='A';
    int plus = 0;

    //1.배열에 알파벳 입력
    for(int i=0; i<alphabet.length; i++){
      for(int j=0; j<alphabet[0].length; j++){
        alphabet[i][j] =(char)((int)start+plus);
        plus++;
      }
    }
    //2.원본 배열 출력
    System.out.println("\t"+"\t"+"\t"+"원본배열"+"\t"+"\t");
    System.out.println("==================");
    for(char[] c1:alphabet){
      for (char c2 : c1) {
        System.out.print(c2+"\t"+"\t");
      }
      System.out.println();
    }
    //3. 배열 수정
    for(int i=0; i<alphabet.length;i++){
        alphabet[i][i] = '*';
      }


    //4. 수정된 배열 출력
    System.out.println("\t"+"\t"+"\t"+"수정된 배열"+"\t"+"\t");
    System.out.println("==================");
    for(char[] c1:alphabet){
      for (char c2 : c1) {
        System.out.print(c2+"\t"+"\t");
      }
      System.out.println();
    }
  }

}
