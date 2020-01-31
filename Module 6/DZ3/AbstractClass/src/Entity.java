import com.sun.source.tree.IfTree;

public class Entity extends Individual
{
    Entity(double money)
    {
        super(money);
    }

//    @Override
//    public void addMoney(double money)
//    {
//        super.addMoney(money);
//    }

    @Override
    public void withdrawMoney(double money)
    {
        super.withdrawMoney(money * 1.01);
    }
}
