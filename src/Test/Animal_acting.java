package Test;

public class Animal_acting {

  public static void main(String[] args) {
    String[] stand = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    String temp1 = "onetwothreefourfivesixseveneightnine";
    for(int i=0; i<stand.length; i++){
      temp1 = temp1.replaceAll(stand[i], ""+i);
    }

  }

}
