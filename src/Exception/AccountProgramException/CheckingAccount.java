package Exception.AccountProgramException;

public class CheckingAccount extends Account {
  private String cardNo;
  public CheckingAccount(String accid, String ownerName, long balance, String cardNo){
    super(accid, balance, ownerName);
    this.cardNo = cardNo;
  }
  @Override
  public void calcRate() {

  }
  public void pay(long amount, String cardNo) throws InsufficientExection {
      if (this.cardNo.equals(cardNo) && amount < super.getBalance()) {
        super.withdraw(amount);
      }
      else
        throw new InsufficientExection();

  }
  public void setCardNo(String cardNo) {
    this.cardNo = cardNo;
  }

  public String getCardNo() {
    return cardNo;
  }
}
