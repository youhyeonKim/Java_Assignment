package ObjectEx;

import java.util.Objects;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor

public class Owner {
  private String name;
  private String cellPhone;

  @Override
  public boolean equals(Object o) {
    Owner owner = (Owner) o;
    return name.equals(owner.getName());
  }

  @Override
  public String toString() {
    return "이름은 " + name + "이고, " +
        "핸드폰 번호는 " + cellPhone + "입니다.";
  }
}
