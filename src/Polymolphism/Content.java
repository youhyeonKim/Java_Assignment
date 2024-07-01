package Polymolphism;

public abstract class Content {
  protected String title;
  protected int price;
  public Content(){}
  public Content(String title){
    this.title = title;
  }
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public int getPrice() {
    return price;
  }
  public void setPrice(int price) {
    this.price = price;
  }
  public abstract void totalPrice();
  public void show(){
    System.out.println(title+" 비디오의 가격은 "+price+ "입니다.");
  }

}
