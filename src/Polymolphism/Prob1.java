package Polymolphism;

public class Prob1 {
public static void main(String[] args) {
  Truck t = new Truck("T1234", 100, 4);
  Bike b = new Bike("B123", 25, 2);
  t.getWheelNumber();
  b.getWheelNumber();
  t.getvelocity();
  b.getvelocity();
	t.speedDown(12);
  b.speedDown(18);
  t.stop();
  b.stop();
  t.speedUp(10);
}
}
