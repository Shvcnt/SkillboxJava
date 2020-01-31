public abstract class Client
{
    private int account;

    public Client ()
    {
        this.account = 0;
    }

    public abstract void addMoney ();
    public abstract void withdrawMoney ();

    public int getAccount() {
        return account;
    }
}
