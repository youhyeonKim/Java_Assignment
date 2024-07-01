package Polymolphism;

public class Video extends Content{
  private String genre;

  public  Video(String title, String genre){
    super(title);
    this.genre = genre;
  }

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  @Override
  public void totalPrice() {
    if(this.genre.equals("new"))
      this.price = 2000;
    else if(this.genre.equals("comic"))
      this.price = 1500;
    else if(this.genre.equals("child"))
      this.price = 1000;
    else
      this.price = 500;
  }
}
