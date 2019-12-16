public class PaymentAccount
{
    public double moneyCount;

    public PaymentAccount (double moneyCount)
    {
        this.moneyCount = moneyCount;
    }

    public double getMoneyCount() {
        return moneyCount;
    }

    public void setMoneyCount(double moneyCount) {
        this.moneyCount = moneyCount;
    }

    public void addMoney(double money)
    {
        this.moneyCount = moneyCount + money;
    }

    public void withdrawMoney(double money)
    {
        this.moneyCount = moneyCount - money;
    }


}
