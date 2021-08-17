package decorator.example;

import java.util.Date;

/**
 * @author liangjuhong
 * @since 2021/8/17
 */
public abstract class Component {
    
    public abstract double calcPrize(String user, Date begin, Date end);
}
