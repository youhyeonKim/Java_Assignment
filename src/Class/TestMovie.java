package Class;

public class TestMovie {

  public static void main(String[] args) {
    Movie myMovie = new Movie();
    myMovie.setTitle("어거스트 러쉬");
    myMovie.setGenre("Drama");
    myMovie.play();

    System.out.println("--------------------");

    Movie yourMovie = new Movie();
    yourMovie.setTitle("나는 전설이다");
    yourMovie.setGenre("SF");
    yourMovie.play();
  }
}
class Movie{
  String title;
  String genre;
  public void play(){
    System.out.printf("%s(%s) 상영중입니다.\n", title, genre);
  }
  public void setTitle(String title){
    this.title = title;
  }
  public void setGenre(String genre){
    this.genre = genre;
  }

}
