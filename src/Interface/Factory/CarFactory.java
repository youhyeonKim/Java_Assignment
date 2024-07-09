package Interface.Factory;

public class CarFactory extends Factory implements IWorkingTogether{

  CarFactory(String name, int openHour, int closeHour) {
    super(name, openHour, closeHour);
  }

  @Override
  int makeProducts(char skill) {
    int output;
    if(skill == 'A')
      output = 3;
    else if(skill == 'B')
      output = 2;
    else if(skill == 'C')
      output = 1;
    else
      output = 0;
    output= output*this.getWorkingTime();
    return output;
  }

  @Override
  public int workTogether(IWorkingTogether parter) {
    return this.makeProducts('B');
  }
}
