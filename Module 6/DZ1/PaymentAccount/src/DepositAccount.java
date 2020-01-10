import java.util.Calendar;
import java.util.Date;

public class DepositAccount extends Account
{
    Calendar calendar = Calendar.getInstance();
    Date date1 = calendar.getTime();

    private static final long MONTH_MILLIS = 2592000000L;

    public DepositAccount(int moneyCount)
    {
        super(moneyCount);
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

    public void withgrawMoney(double money)
    {
        Date date2 = calendar.getTime();
        long dt = date2.getTime() - date1.getTime();
        boolean compareDate = dt > MONTH_MILLIS;

        if (compareDate) {
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
        else {
            System.out.println("Вы не можете снять денежные средства, т.к. после последнего пополнения" +
                    " не прошел 1 месяц");
        }
    }

    public void addMonth()
    {
        System.out.println("Прошел 1 месяц......");
        calendar.add(Calendar.MONTH, +1);
    }

}
