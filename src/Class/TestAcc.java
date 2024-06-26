package Class;

public class TestAcc {

  public static void main(String[] args) throws Exception {

    String accNo = null;
    int balance = 0;

    Account accObj = new Account();
    accObj.setAccNo("078-3762-293");
    accNo = accObj.getAccNo();
    balance = accObj.getBalance();
    System.out.println(accNo + " 계좌의 잔고는 " + balance + "만원입니다.");

    accObj.save(100);
    balance = accObj.getBalance();
    System.out.println(accObj.getAccNo() + " 계좌의 잔고는 " + balance + "만원입니다.");

    accObj.deposit(30);
    balance = accObj.getBalance();
    System.out.println(accNo + " 계좌의 잔고는 " + balance + "만원입니다.");
  }

}
class Account{
  private String accNo;
  private int balance;
  public void setAccNo(String accNo){
    System.out.println("개좌가 개설되었습니다.");
    this.accNo = accNo;
  }
  public String getAccNo(){
    return accNo;
  }
  public int getBalance(){
    return balance;
  }
  public void save(int money){
    System.out.printf("%s\t 계좌에 %d만원이 입금되었습니다.\n", accNo, money);
    balance += money;
  }

  public void deposit(int money){
    System.out.printf("%s\t 계좌에 %d만원이 출금되었습니다.\n", accNo, money);
    balance -= money;
  }


}
