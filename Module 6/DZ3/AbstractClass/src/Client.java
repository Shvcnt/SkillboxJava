public abstract class Client
{
    private double account;

    Client(double money)
    {
        if (money > 0) {
            this.account = money;
        }
        else {
            System.out.println("Невозможно открыть р/с с отрицательной суммой на балансе. Р/с открыт с нулевым остатком.");
        }
    }

    public double getAccount()
    {
        return account;
    }

    public void setAccount(double money)
    {
        this.account += money;
    }

    public abstract void addMoney(double money);
    public abstract void withdrawMoney(double money);
    public abstract double getMoneyCount();
}
