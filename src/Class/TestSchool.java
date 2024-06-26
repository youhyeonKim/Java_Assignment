package Class;

public class TestSchool {

  public static void main(String[] args) {

    Student s = new Student();
    s.setName("홍길동");
    s.setAge(20);
    s.setId(200201);
    Teacher t = new Teacher ();
    t.setName("홍길동");
    t.setAge(30);
    t.setSubject("JAVA");
    Employee  e= new Employee();
    e.setName("홍길동");
    e.setAge(40);
    e.setDept("교무과");

    s.print();
    t.print();
    e.print();
  }

}
class Student{
  private String name;
  private int age;
  private int id;
  public void setName(String name){
    this.name= name;
  }
  public void setAge(int age){
    this.age= age;
  }
  public void setId(int id){
    this.id= id;
  }
  public void print(){
    System.out.print("이름:"+name+"\t");
    System.out.print("나이:"+age+"\t");
    System.out.print("학번:"+id+"\t");
    System.out.println();
  }

}
class Teacher{
  private String name;
  private int age;
  private String subject;
  public void setName(String name){
    this.name= name;
  }
  public void setAge(int age){
    this.age= age;
  }
  public void setSubject(String subject){
    this.subject= subject;
  }
  public void print(){
    System.out.print("이름:"+name+"\t");
    System.out.print("나이:"+age+"\t");
    System.out.print("담당과목:"+subject+"\t");
    System.out.println();
  }
}
class Employee{
  private String name;
  private int age;
  private String dept;
  public void setName(String name){
    this.name= name;
  }
  public void setAge(int age){
    this.age= age;
  }
  public void setDept(String dept){
    this.dept= dept;
  }
  public void print(){
    System.out.print("이름:"+name+"\t");
    System.out.print("나이:"+age+"\t");
    System.out.print("부서:"+dept+"\t");
    System.out.println();
  }
}