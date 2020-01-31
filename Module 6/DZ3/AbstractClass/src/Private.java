public class Private extends Individual
{
    Private(double money)
    {
        super(money);
    }

    @Override
    public void addMoney(double money)
    {
        if (money < 1000)
        {
            super.addMoney(money -= money * 0.01);
        }
        else
        {
            super.addMoney(money -= money * 0.005);
        }
    }

//    @Override
//    public void withdrawMoney(double money)
//    {
//        super.withdrawMoney(money);
//    }
}
