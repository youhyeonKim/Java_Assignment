package Polymolphism;

import org.w3c.dom.ls.LSOutput;

public abstract class Beverage {
  private String name;
  protected int price;
  public Beverage(){}
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Beverage(String name){}
  public abstract void calcPrice();
  public void print(){
    calcPrice();
    System.out.println(" 번째 판매 음료는 "+ this.name+"이며, 가격은 "+this.price);
  }

}
