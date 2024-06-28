package Inheritance;

public class MempVO extends Employee {

  private String mdept;

  public MempVO(String mdept) {
    this.mdept = mdept;
  }

  public MempVO(String name, int age, String phone, String empDate, boolean marriage, String dept,
      String mdept) {
    super(name, age, phone, empDate, dept, marriage);
    this.mdept = mdept;
  }

}
