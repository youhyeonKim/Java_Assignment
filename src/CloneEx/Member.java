package CloneEx;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Member implements Cloneable{
  private String name;
  private int age;
  private Address addr;

  @Override
  protected Member clone() throws CloneNotSupportedException {
    try {
      Object cloneAddress = addr.clone();
      Address addr = (Address) cloneAddress;
      Member cloneMember = (Member) super.clone();
      cloneMember.setAddr(addr);
      return cloneMember;
    } catch (CloneNotSupportedException e) {
      return null;
    }
  }
}
