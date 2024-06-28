package Inheritance;

public class RempVO extends Employee {

  public RempVO() {
    super();
  }

  public RempVO(String name, int age, String phone, String empDate, boolean marriage, String dept) {
    super(name, age, phone, empDate, dept, marriage);

  }

  public RempVO(String name, int age, String phone) {
    super(name, age, phone);
  }
}
