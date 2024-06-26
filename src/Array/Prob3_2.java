package Array;

public class Prob3_2 {

  public static void main(String[] args) {
    Prob3_2 p = new Prob3_2();
    int[][] a= {
        {30, 30, 30, 30},
        {40, 40, 40, 40},
        {50, 50, 50, 50},
    };
    int[][] b= {
        {1, 2, 3, 4},
        {5, 6, 7, 8},
        {9, 10, 11, 12},
    };
    int[][] c = new int[a.length][a[0].length];
    c = p.sub(a, b, c);
    p.prn(c);
  }
  public int[][] sub(int[][] a, int[][] b, int[][] c){
    int row = a.length;
    int col = a[0].length;
    for(int i=0; i<row; i++){
      for(int j=0; j<col; j++){
        c[i][j] = a[i][j] - b[i][j];
      }
    }
    return c;
  }
  public void prn(int[][] c){
    for(int[] n1:c){
      for(int n2:n1){
        System.out.print(n2+" ");
      }
      System.out.println();
    }
  }


}
