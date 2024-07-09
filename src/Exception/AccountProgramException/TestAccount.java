package Exception.AccountProgramException;


public class TestAccount {

  public static void main(String[] args){
    CheckingAccount c = new CheckingAccount("a134", "김유현",50000, "110-527-561");
    System.out.println("현재금액: "+c.getBalance());
    try {
      c.pay(60000, "110-527-561");
      c.pay(30000, "110-527-561");
      System.out.println("현재금액====>"+c.getBalance());
    } catch (InsufficientExection e) {
      System.err.println("잔액이 부족합니다.");
    }

  }
}
