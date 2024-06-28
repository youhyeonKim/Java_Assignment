package AccountProgram;

public class CheckingAccount extends Account{
  private String cardNo;
  public CheckingAccount(String accid, String ownerName, long balance, String cardNo){
    super(accid, balance, ownerName);
    this.cardNo = cardNo;
  }
  @Override
  public void calcRate() {

  }
  public void pay(long amount, String cardNo){
    if (this.cardNo.equals(cardNo) && amount < super.getBalance()) {
      super.withdraw(amount);
    } else {
      System.out.println("지불이 불가능합니다.");
    }
  }
  public void setCardNo(String cardNo) {
    this.cardNo = cardNo;
  }

  public String getCardNo() {
    return cardNo;
  }
}
