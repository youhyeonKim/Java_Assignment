package board;

import java.util.Date;
import lombok.Data;

@Data
public class Boards {
  private int bno;
  private String btitle;
  private String bcontent;
  private String bwriter;
  private Date bdate;//util인지 sql인지 확인
}
