package Interface.Animals;

public class Dog extends Animal{
  double present_distance;
  Dog(int speed) {
    super(speed);
  }

  @Override
  void run(int hours) {
    present_distance = this.getSpeed()*0.5*hours;
    this.setDistance(this.getDistance()+present_distance);
  }
}
