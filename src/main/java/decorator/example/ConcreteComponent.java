package decorator.example;

import java.util.Date;

/**
 * @author liangjuhong
 * @since 2021/8/17
 */
public class ConcreteComponent extends Component{
    @Override
    public double calcPrize(String user, Date begin, Date end) {
        // 默认实现，没有逻辑
        return 0;
    }
}
