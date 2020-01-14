public class CardAccount extends Account
{
    public CardAccount(double moneyCount)
    {
        super(moneyCount);
    }

    public void withdrawMoney (double money)
    {
        super.withdrawMoney(money * 1.01);
    }
}
