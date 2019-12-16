public class Card extends PaymentAccount
{
    public Card(double moneyCount)
    {
        super(moneyCount);
    }

    public void withdrawMoney (double money)
    {
        double procentOfOperation = money * 0.01;
        this.moneyCount = moneyCount - money - procentOfOperation;
    }
}
