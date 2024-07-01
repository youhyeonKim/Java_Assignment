package Polymolphism;

public class Coffee extends Beverage{
  static int amount;

  public Coffee(String name){
    super.setName(name);
    amount++;
  }
  @Override
  public void calcPrice() {
    switch (super.getName()){
      case "Americcano":
        this.price = 1500;
        break;
      case "CafeLatte":
        this.price = 2500;
        break;
      case "Cappuccino":
        this.price = 3000;
        break;
    }
  }
}
