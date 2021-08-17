package decorator.template;

/**
 * @author liangjuhong
 * @since 2021/8/17
 */
public class ConcreteDecoratorB extends Decorator{
    public ConcreteDecoratorB(Component component) {
        super(component);
    }
    
    private void addedBehavior() {
        // todo
    }
    
    @Override
    public void operation() {
        super.operation();
    }
}
