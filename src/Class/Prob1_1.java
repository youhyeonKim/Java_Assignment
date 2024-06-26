package Class;

public class Prob1_1{

  public static void main(String[] args) {

    Emp emp = new Emp();
    emp.setId("12345");
    emp.setName("홍길동");
    emp.setBaseSalary(50000);
    System.out.println( emp.toString() );
    System.out.println( "봉급 = " + emp.getSalary( 30 ) );

  }

}
class Emp{
  private String id;
  private String name;
  private int baseSalary;

  public void setName(String name){
    this.name= name;
  }
  public String getName(String name){
    return name;
  }
  public void setId(String id){
    this.id = id;
  }
  public String getId(String name){
    return id;
  }
  public void setBaseSalary(int money){
    this.baseSalary = money;
  }
  public int getBaseSalary(int money){
    return baseSalary;
  }
  public double getSalary(double bonus){
    double salary;
    salary = baseSalary + (baseSalary*bonus);
    return salary;
  }
  public String toString(){
    return String.format("%s(%s)사원의 기본급은 %d원입니다.", name, id, baseSalary);
  }

}
