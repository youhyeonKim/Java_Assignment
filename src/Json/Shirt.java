package Json;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class Shirt {
  @Data
  @AllArgsConstructor
  class extra_product_info{
    private String color;
    private String size;

  }
  @Data
  @AllArgsConstructor
  class item{//어울리는 품목
    private String skirt;
    private String shoes;
  }

  private String product_name;
  private int product_no;
  private extra_product_info extraProductInfo;
  private item item_list;

  public Shirt(String product_name, int product_no, String color, String size, String skirt, String shoes){
    this.product_name = product_name;
    this.product_no = product_no;
    this.extraProductInfo = new extra_product_info(color,size);
    this.item_list = new item(skirt, shoes);
  }


}
