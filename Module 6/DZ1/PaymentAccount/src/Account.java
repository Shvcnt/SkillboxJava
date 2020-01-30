public class Account
{
    private double moneyCount;

    public Account(double moneyCount)
    {
        this.moneyCount = moneyCount;
    }

    public double getMoneyCount() {
        System.out.println("Остаток денежных средств: " + moneyCount + " рублей.");
        return moneyCount;
    }

    public void addMoney(double money)
    {
        if (money > 0) {
            moneyCount += money;
            System.out.println("Пополнение счета на: " + money + " рублей." +
                    " Остаток денежных средств: " + moneyCount + " рублей.");
        }
        else {
            System.out.println("Вы не можете пополнить счет на отрицательную сумму");
        }
    }

    public void withdrawMoney(double money)
    {
        if (money > 0) {
            if (moneyCount > money) {
                moneyCount -= money;
                System.out.println("Снятие денежных средств со счета: " + money + " рублей." +
                        " Остаток денежных средств: " + moneyCount + " рублей.");
            } else {
                System.out.println("Недостаточно средств");
            }
        }
        else {
            System.out.println("Вы не можете снять отрицательную сумму");
        }
    }
}
