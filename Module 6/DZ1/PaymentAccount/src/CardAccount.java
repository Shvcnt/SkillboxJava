public class CardAccount extends Account
{
    public CardAccount(double moneyCount)
    {
        super(moneyCount);
    }

    public void withdrawMoney (double money)
    {
        if (money > 0) {
            if (moneyCount > money) {
                double commision = money * 0.01;
                moneyCount -= money + commision;
                System.out.println("Снятие денежных средств со счета: " + money + " рублей." +
                        " Остаток денежных средств: " + moneyCount + " рублей, комиссия составила: " + commision
                        + " рублей.");
            } else {
                System.out.println("Недостаточно средств");
            }
        }
        else {
            System.out.println("Вы не можете снять отрицательную сумму");
        }
    }
}
