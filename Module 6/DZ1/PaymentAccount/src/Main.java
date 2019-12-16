public class Main
{
    public static void main(String[] args)
    {
        PaymentAccount paymentAccount = new PaymentAccount(1000);
        paymentAccount.withdrawMoney(400);
        System.out.println(paymentAccount.getMoneyCount());
        paymentAccount.addMoney(15000);
        System.out.println(paymentAccount.getMoneyCount());

        Card card = new Card(15000);
        card.withdrawMoney(1000);
        System.out.println(card.getMoneyCount());

        Deposit deposit = new Deposit(15000);
        deposit.addMoney(10000);
        deposit.addMonth();
        deposit.withgrawMoney(1000);
        System.out.println(deposit.getMoneyCount());
    }
}
