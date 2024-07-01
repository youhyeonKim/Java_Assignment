package Polymolphism;

public class Truck extends Wheeler{
  public Truck(String carName, int velocity, int WheelNumber){
    this.carName = carName;
    this.velocity = velocity;
    this.wheelNumber = WheelNumber;
  }
  public void getWheelNumber(){
    System.out.println("트럭: 바퀴"+this.wheelNumber+"개입니다.");
  }

  public void getvelocity(){
    System.out.println("트럭의 현재속도는 "+ this.velocity+ "입니다.");
  }

  @Override
  public void speedUp(int speed) {
    this.velocity = speed*5 + this.velocity;
    if (this.velocity > 100) {
      this.velocity = 100;
      System.out.println("트럭의 최고속도 위반으로 속도를 100으로 내립니다.");
    } else {
      System.out.println("트럭의 현재속도는 "+ this.velocity+ "입니다.");
    }
  }

  @Override
  public void speedDown(int speed) {
    this.velocity = this.velocity - 5*speed;
    if (this.velocity < 50) {
      this.velocity = 50;
      System.out.println("트럭의 최저속도 위반으로 속도를 50으로 올립니다.");
    } else {
      System.out.println("트럭의 현재속도는 "+ this.velocity+ "입니다.");
    }

  }
}
