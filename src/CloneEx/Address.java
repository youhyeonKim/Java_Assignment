package CloneEx;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Address implements Cloneable{
  private int code;
  private String addr;

  @Override
  public String toString() {
    return "Address{" +
        "code='" + code + '\'' +
        ", addr=" + addr + '\'' + this.hashCode() +
        '}';
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    return super.clone();
  }
}
