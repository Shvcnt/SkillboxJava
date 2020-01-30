import java.util.Calendar;
import java.util.Date;

public class DepositAccount extends Account
{
    Calendar calendar = Calendar.getInstance();
    Date date1 = calendar.getTime();

    private static final long MONTH_MILLIS = 2592000000L;

    DepositAccount(int moneyCount)
    {
        super(moneyCount);
    }

    @Override
    public void addMoney(double money)
    {
        Date dateAdd = calendar.getTime();
        date1 = dateAdd;
        super.addMoney(money);
    }

    @Override
    public void withdrawMoney(double money)
    {
        Date date2 = calendar.getTime();
        long dt = date2.getTime() - date1.getTime();
        boolean compareDate = dt > MONTH_MILLIS;

        if (compareDate) {
            super.withdrawMoney(money);
        }
        else {
            System.out.println("Вы не можете снять денежные средства, т.к. после последнего пополнения" +
                    " не прошел 1 месяц");
        }
    }

    void addMonth()
    {
        System.out.println("Прошел 1 месяц......");
        calendar.add(Calendar.MONTH, +1);
    }

}
