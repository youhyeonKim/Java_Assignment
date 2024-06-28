package Inheritance;

public class SempVO extends Employee {

  private String senior;

  public SempVO() {
  }

  public SempVO(String name, int age, String phone, String empDate, boolean marriage, String dept,
      String senior) {
    super(name, age, phone, empDate, dept, marriage);
    this.senior = senior;
  }

  public SempVO(String senior) {
    this.senior = senior;
  }
}
