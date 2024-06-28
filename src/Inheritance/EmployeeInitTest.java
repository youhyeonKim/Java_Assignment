package Inheritance;

public class EmployeeInitTest {

  public static void main(String[] args) {
    RempVO vo1 = new RempVO();
    RempVO vo = new RempVO("홍길동", 30, "010-111-1111", "2024-06-27", true, "홍보부");
    System.out.println(vo.toString());
  }
}
