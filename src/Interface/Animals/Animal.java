package Interface.Animals;

public abstract class Animal {
  private int speed;
  private double distance;
  Animal(int speed){
    this.speed = speed;
  }

  abstract void run(int hours);
  double getDistance(){
    return distance;
  }


  public void setDistance(double distance) {
    this.distance = distance;
  }
  public int getSpeed() {
    return speed;
  }
  public void setSpeed(int speed) {
    this.speed = speed;
  }


}
