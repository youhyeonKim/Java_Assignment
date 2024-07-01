package AccountProgram;

public class TestAccount {

  public static void main(String[] args) {
    CheckingAccount c = new CheckingAccount("a134", "김유현",50000, "110-527-561");
    System.out.println("현재금액: "+c.getBalance());
    c.pay(60000, "110-527-561");
    c.pay(30000, "110-527-562");
    System.out.println("현재금액====>"+c.getBalance());

  }
}
