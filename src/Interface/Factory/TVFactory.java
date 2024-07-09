package Interface.Factory;

public class TVFactory extends Factory implements IWorkingTogether{

  TVFactory(String name, int openHour, int closeHour) {
    super(name, openHour, closeHour);
  }

  @Override
  int makeProducts(char skill) {
    int output;
    if(skill == 'A')
      output = 8;
    else if(skill == 'B')
      output = 5;
    else if(skill == 'C')
      output = 3;
    else
      output = 1;
    output= output*this.getWorkingTime();
    return output;
  }

  @Override
  public int workTogether(IWorkingTogether parter) {
    return this.makeProducts('C');
  }
}
