package Polymolphism;

public class Circle extends  Shape{
  private double radius;

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public Circle(String name, double radius){
    super(name);
    this.radius = radius;
  }
  @Override
  public void calculationArea() {
    this.area = 2*Math.pow(this.radius,2)*Math.PI;
    super.print();
  }
}
