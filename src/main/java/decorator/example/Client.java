package decorator.example;

/**
 * @author liangjuhong
 * @since 2021/8/17
 */
public class Client {
    
    public static void main(String[] args) {
        // 典型套娃
        Component c1 = new ConcreteComponent();
        
        Decorator d1 = new MonthPrizeDecorator(c1);
        Decorator d2 = new SumPrizeDecorator(d1);
        
        Decorator d3 = new GroupPrizeDecorator(d2);
        
        double ans = d3.calcPrize("", null, null);
        System.out.println(ans);
    }
}
