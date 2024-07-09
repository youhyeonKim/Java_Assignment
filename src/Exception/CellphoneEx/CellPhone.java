package Exception.CellphoneEx;

public class CellPhone {
  private String model;
  private double battery;

  CellPhone(String model){
    this.model = model;
  }

  public void call(int time){
      try{
        if(time<0)
          throw new IllegalArgumentException("통화시간입력오류");
        else{
          System.out.println("통화시간 : "+time + " 분");
          double reduced_battery = time*0.5;
          setBattery(getBattery()-reduced_battery<0? 0:getBattery()-reduced_battery);
        }
      }catch (IllegalArgumentException e){
        System.err.println(e.getMessage());
      }
  }
  public void charge(int time){
    try {
      if(time < 0)
        throw new IllegalArgumentException("충전시간오류");
      else{
        System.out.println("충전 시간 : "+time+" 분");
        double increased_battery = time*3;
        setBattery(getBattery()+increased_battery>100? 100:getBattery()+increased_battery);
      }
    } catch (IllegalArgumentException e) {
      System.err.println(e.getMessage());
    }

  }
  public void printBattery(){
    System.out.println("남은 배터리 양 : "+this.getBattery());
  }

  public double getBattery() {
    return battery;
  }

  public void setBattery(double battery) {
    this.battery = battery;
  }
}
