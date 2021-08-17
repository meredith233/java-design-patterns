package decorator.example;

import java.util.Date;

/**
 * @author liangjuhong
 * @since 2021/8/17
 */
public class MonthPrizeDecorator extends Decorator{
    public MonthPrizeDecorator(Component component) {
        super(component);
    }
    
    @Override
    public double calcPrize(String user, Date begin, Date end) {
        double money = super.calcPrize(user, begin, end);
        
        double prize = 0.03;
        return money + prize;
    }
}
