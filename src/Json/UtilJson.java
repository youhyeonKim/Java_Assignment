package Json;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class UtilJson {

  public static JSONObject createJsonData() {
    /**
     * 모든 데이터를 담을 JSONObject 생성
     */

    JSONObject productInfo = new JSONObject();
    /**
     * value로 단순 값(string, int)를 가지는 프로퍼티 처리.
     * product_no
     * product_name
     */
    productInfo.put("product_no", 12367);
    productInfo.put("product_name", "NewBalance woman T");

    /**
     * value로 Json을 가지는 프로퍼티 처리.
     * extra_product_info JSONObject 생성
     */
    JSONObject extra_product_info = new JSONObject();
    extra_product_info.put("color", "white");
    extra_product_info.put("size", "S");
    productInfo.put("extra_product_info", extra_product_info);

    /**
     * value로 Array를 가지는 프로퍼티 처리.
     * item_list JSONArray 생성
     * item_list.* JSONObject 생성하세요
     */
    JSONArray item_list = new JSONArray();
    JSONObject item_list1 = new JSONObject();
    item_list1.put("skirt", "kangkang");
    item_list1.put("shoes", "pump");
    item_list.put(item_list1);
    JSONObject item_list2 = new JSONObject();
    item_list2.put("skirt", "Hline");
    item_list2.put("shoes", "Sneakers");
    item_list.put(item_list2);
    productInfo.put("item_list",item_list);

    return productInfo;
  }

  public static void parseJsonData(JSONObject jsonObject) {


    /**
     * String 형태로 만들어져있는 JSON 데이터를 파싱해줄 객체 생성.
     */

    /**
     * JSON 데이터가 String 형태로 들어왔음을 가정하기 위해
     * Json 데이터를 생성하고 String 형태로 바꿔주었다.
     */
    JSONObject product_info = new JSONObject(jsonToString(jsonObject));

    /**
     * value로 단순 값(string, int)를 가지는 프로퍼티 조회.
     * product_no, product_name
     */
    int product_no = product_info.getInt("product_no");
    String product_name = product_info.getString("product_name");

    /**
     * value로 Json을 가지는 프로퍼티 조회.
     * extra_product_info를 꺼낼 때, JSONObject로 캐스팅.
     */
    JSONObject extra_product_info = product_info.getJSONObject("extra_product_info");
    String color = extra_product_info.getString("color");
    String size = extra_product_info.getString("size");

    /**
     * value로 Array를 가지는 프로퍼티 조회.
     * item_list를 꺼낼 때, JSONArray로 캐스팅.
     */
    JSONArray item_list = new JSONArray("item_list");
    for (int i = 0; i < item_list.length(); i++) {
      JSONObject item = item_list.getJSONObject(i);
      System.out.println("어울리는 Item("+(i+1)+"): "+jsonToString(item));
    }

}

  public static void parseJsonDataUseIterator(JSONObject jsonObject) {
    /**
     * String 형태로 만들어져있는 JSON 데이터를 파싱해줄 객체 생성.
     */


    /**
     * JSON 데이터가 String 형태로 들어왔음을 가정하기 위해
     * Json 데이터를 생성하고 String 형태로 바꿔주었다.
     */
    JSONObject product_info = new JSONObject(jsonToString(jsonObject));

      /**
       * value로 단순 값(string, int)를 가지는 프로퍼티 조회.
       * product_no, product_name
       */
    int product_no = product_info.getInt("product_no");
    String product_name = product_info.getString("product_name");

      /**
       * value로 Json을 가지는 프로퍼티 조회.
       * extra_product_info를 꺼낼 때, JSONObject로 캐스팅.
       */
    JSONObject extra_product_info = product_info.getJSONObject("extra_product_info");
    String color = extra_product_info.getString("color");
    String size = extra_product_info.getString("size");

      /**
       * value로 Array를 가지는 프로퍼티 조회.
       * item_list를 꺼낼 때, JSONArray로 캐스팅.
       */
    JSONArray item_list = product_info.getJSONArray("item_list");

    for(int i=0; i<item_list.length();i++){
      JSONObject item = item_list.getJSONObject(i);
      Iterator<String> keys = item.keys();
      while(keys.hasNext()){
        String key = keys.next();
        String value = item.getString(key);
      }
    }
        /**
         * item_list의 각 원소를 JSONObject로 캐스팅 후, 변수의 키셋을 가져온다.
         * [참고] 각 원소의 키가 다를 경우 유용하다.
         */

  }


public static String jsonToString(JSONObject jsonObject) {
  return jsonObject.toString();
}


}
