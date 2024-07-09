package ObjectEx;

import java.util.Objects;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@Data
public class Vehicle {
  private int Price;
  private Owner owner;

  @Override
  public String toString() {
    return "소유주 정보 : 이름은" +
        owner.getName() +
        "이고 핸드폰 번호는 " + owner+"\n"+
        "차량정보 :  가격은 "+ Price+"입니다.";
  }

  @Override
  public boolean equals(Object o) {
    Vehicle vehicle = (Vehicle) o;
    return owner.equals(vehicle.getOwner());
  }

}
