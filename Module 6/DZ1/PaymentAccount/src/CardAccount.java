public class CardAccount extends Account
{
    CardAccount(double moneyCount)
    {
        super(moneyCount);
    }

    @Override
    public void withdrawMoney (double money)
    {
        super.withdrawMoney(money * 1.01);
    }
}
