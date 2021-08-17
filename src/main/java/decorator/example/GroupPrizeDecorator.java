package decorator.example;

import java.util.Date;

/**
 * @author liangjuhong
 * @since 2021/8/17
 */
public class GroupPrizeDecorator extends Decorator{
    public GroupPrizeDecorator(Component component) {
        super(component);
    }
    
    @Override
    public double calcPrize(String user, Date begin, Date end) {
        double money = super.calcPrize(user, begin, end);
        
        double prize = 0.01;
        return money + prize;
    }
}
