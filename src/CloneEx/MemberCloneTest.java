package CloneEx;

public class MemberCloneTest {

  public static void main(String[] args) {
    Member member1 = new Member("ssg", 30, new Address(1011, "서울시 영등포구"));

    try {
      Member member2 = member1.clone();
      Address address1 = member1.getAddr();
      address1.setCode(1012);
      address1.setAddr("서울시 강남구");
      Address address2 = member2.getAddr();
      System.out.println(member1.hashCode());
      System.out.println(member2.hashCode());
      System.out.println(address1.toString());
      System.out.println(address2.toString());
    } catch (CloneNotSupportedException e) {
      throw new RuntimeException(e);
    }

  }

}
