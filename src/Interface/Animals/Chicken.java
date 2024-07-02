package Interface.Animals;

public class Chicken extends Animal implements Cheatable{
  double present_distance;
  Chicken(int speed) {
    super(speed);
  }

  @Override
  void run(int hours) {
    present_distance = hours*this.getSpeed();
    this.setDistance(this.getDistance()+present_distance);
  }

  @Override
  public void fly() {
    this.setSpeed(this.getSpeed()*2);
  }
}
