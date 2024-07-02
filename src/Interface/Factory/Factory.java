package Interface.Factory;

public abstract class Factory {
  private int openHour;
  private int closeHour;
  private String name;

  Factory(String name, int openHour, int closeHour){
    this.name = name;
    this.openHour = openHour;
    this.closeHour = closeHour;
  }
  String getFactoryName(){
    return name;
  }
  int getWorkingTime(){
    return closeHour - openHour;
  }
  abstract  int makeProducts(char skill);
}
