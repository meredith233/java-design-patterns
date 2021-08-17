package decorator.example;

import java.util.Date;

/**
 * @author liangjuhong
 * @since 2021/8/17
 */
public abstract class Decorator extends Component{
    
    protected Component component;
    
    public Decorator(Component component) {
        this.component = component;
    }
    
    @Override
    public double calcPrize(String user, Date begin, Date end) {
        return component.calcPrize(user, begin, end);
    }
}
