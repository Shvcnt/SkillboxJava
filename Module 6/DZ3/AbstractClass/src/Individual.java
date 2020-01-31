public class Individual extends Client
{
    Individual(double money) {
        super(money);
    }

    @Override
    public void addMoney(double money)
    {
        if (money > 0) {
            setAccount(money);
            System.out.println("Пополнение расчетного счета на " + money + " рублей.");
        }
        else {
            System.out.println("Невозможно пополнить р/с на отрицательную сумму.");
        }
    }

    @Override
    public void withdrawMoney(double money)
    {
        if (money > 0)
        {
            boolean check = (getAccount() - money) > 0;
            if (check)
            {
                setAccount(- money);
                System.out.println("Снятие с  расчетного счета " + money + " рублей.");
            }
            else {
                System.out.println("Недостаточно д/с на р/с для снятия. Пополните баланс.");
            }
        }
        else {
            System.out.println("Невозможно снять отрицательную сумму с р/с.");
        }
    }

    @Override
    public double getMoneyCount() {
        System.out.println("Остаток денежных средств на р/с: " + getAccount() + " рублей.");
        return getAccount();
    }
}
