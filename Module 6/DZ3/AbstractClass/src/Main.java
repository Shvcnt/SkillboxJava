public class Main
{
    public static void main(String[] args)
    {
        Client ind = new Individual(-1000);
        ind.getMoneyCount();
        ind.addMoney(500);
        ind.getMoneyCount();
        ind.withdrawMoney(-150);
        ind.getMoneyCount();
        ind.withdrawMoney(10000);

        System.out.println("==============================");

        Client ent = new Entity(-1000);
        ent.getMoneyCount();
        ent.addMoney(500);
        ent.getMoneyCount();
        ent.withdrawMoney(100);
        ent.getMoneyCount();
        ent.withdrawMoney(10000);

        System.out.println("==============================");

        Client priv = new Private(2000);
        priv.getMoneyCount();
        priv.withdrawMoney(100);
        priv.getMoneyCount();
        priv.addMoney(900);
        priv.getMoneyCount();
        priv.addMoney(1000);
        priv.getMoneyCount();



    }
}
