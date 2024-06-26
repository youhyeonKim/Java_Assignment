package Class;

public class PlayBird {

  public static void main(String s[]){
    Duck duck = new Duck();
    duck.setName("꽥꽥이");
    duck.fly();
    duck.sing();
    System.out.println(duck.toString());

    Sparrow sparrow = new Sparrow();
    sparrow.setName("짹짹");
    sparrow.fly();
    sparrow.sing();
    System.out.println(sparrow.toString());


  }
}
class Duck{
  private String name;
  private int legs;
  private double length;
  public void setName(String name){
    this.name= name;
  }

  public void fly(){
    System.out.printf("오리(%s)는 날지않습니다\n", name);
  }

  public void sing(){
    System.out.printf("오리(%s)가 소리내어 웁니다\n", name);
  }
  public String toString(){
    return String.format("오리의 이름은 %s입니다\n", name);
  }

}

class Sparrow{
  private String name;
  private int legs;
  private double length;
  public void setName(String name){
    this.name= name;
  }

  public void fly(){
    System.out.printf("참새(%s)는 날아다닙니다\n", name);
  }

  public void sing(){
    System.out.printf("참새(%s)가 소리내어 웁니다\n", name);
  }
  public String toString(){
    return String.format("오리의 이름은 %s입니다\n", name);
  }

}
