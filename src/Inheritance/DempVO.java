package Inheritance;

public class DempVO extends Employee {

  private String period;

  public DempVO() {

  }

  public DempVO(String name, int age, String phone, String empDate, boolean marriage, String dept,
      String period) {
    super(name, age, phone, empDate, dept, marriage);
    this.period = period;
  }

  public DempVO(String name, int age, String phone, String period) {
    super(name, age, phone);
    this.period = period;
  }
}
