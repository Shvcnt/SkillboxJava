import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Deposit extends PaymentAccount
{
    Calendar calendar = Calendar.getInstance();
    Date date1 = calendar.getTime();

    private static final long MONTH_MILLIS = 2592000000L;

    public Deposit(int moneyCount)
    {
        super(moneyCount);
    }

    public void addMoney(double money)
    {
        this.moneyCount = moneyCount + money;
    }

    public void withgrawMoney(double money)
    {
        Date date2 = calendar.getTime();
        long dt = date2.getTime() - date1.getTime();
        boolean compareDate = dt > MONTH_MILLIS;

        if (compareDate)
        {
            this.moneyCount = moneyCount - money;
            date1.setTime(date2.getTime());
        }
        else {
            System.out.println("Вы не можете снять денежные средства, т.к. после последнего пополнения" +
                    " не прошел 1 месяц");
        }
    }

    public void addMonth()
    {
        calendar.add(Calendar.MONTH, +1);
    }

}
