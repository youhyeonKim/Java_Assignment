package Polymolphism;

public class Bike extends Wheeler{

  public Bike(String carName, int velocity, int WheelNumber){
    this.carName = carName;
    this.velocity = velocity;
    this.wheelNumber = WheelNumber;
  }

  public void getWheelNumber(){
    System.out.println("자전거: 바퀴"+this.wheelNumber+"개입니다.");
  }

  public void getvelocity(){
    System.out.println("자전거의 현재속도는 "+ this.velocity+ "입니다.");
  }

  @Override
  public void speedUp(int speed) {
    this.velocity = speed + this.velocity;
    if (this.velocity > 40) {
      this.velocity = 40;
      System.out.println("자전거의 최고속도 위반으로 속도를 40으로 내립니다.");
    } else {
      System.out.println("자전거의 현재속도는 "+ this.velocity+ "입니다.");
    }
  }

  @Override
  public void speedDown(int speed) {
    this.velocity = this.velocity - speed;
    if (this.velocity < 10) {
      this.velocity = 10;
      System.out.println("자전거의 최저속도 위반으로 속도를 10으로 올립니다.");
    } else {
      System.out.println("자전거의 현재속도는 "+ this.velocity+ "입니다.");
    }

  }
}
