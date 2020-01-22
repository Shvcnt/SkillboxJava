import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Account paymentAccount = new Account(1000);
        paymentAccount.withdrawMoney(400);
        paymentAccount.withdrawMoney(300000);
        paymentAccount.withdrawMoney(-400);
        paymentAccount.addMoney(15000);
        paymentAccount.addMoney(-15000);

        System.out.println("===================================================");

        CardAccount card = new CardAccount(15000);
        card.withdrawMoney(1000);
        card.withdrawMoney(17000);
        card.withdrawMoney(-1000);

        System.out.println("===================================================");

        DepositAccount deposit = new DepositAccount(15000);
        deposit.addMoney(10000);
        deposit.addMoney(-10000);
        deposit.withdrawMoney(1000);
        deposit.addMonth();
        deposit.withdrawMoney(1000);
        deposit.withdrawMoney(300000);
        deposit.withdrawMoney(-1000);
        deposit.addMoney(10000);
        deposit.withdrawMoney(1000);
    }
}
