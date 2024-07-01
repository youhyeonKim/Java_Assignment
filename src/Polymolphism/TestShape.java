package Polymolphism;

public class TestShape {
  public static void main(String[] args) {
    Shape [] shape = new Shape[2];
    shape[0] = new Rectangular("직사각형", 40, 5);
    shape[1] = new Circle("원", 10);
    shape[0].calculationArea();
    shape[1].calculationArea();


  }
}