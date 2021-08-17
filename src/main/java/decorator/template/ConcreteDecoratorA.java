package decorator.template;

/**
 * @author liangjuhong
 * @since 2021/8/17
 */
public class ConcreteDecoratorA extends Decorator{
    public ConcreteDecoratorA(Component component) {
        super(component);
    }
    
    private String addedState;
    
    public String getAddedState() {
        return addedState;
    }
    
    public void setAddedState(String addedState) {
        this.addedState = addedState;
    }
    
    @Override
    public void operation() {
        super.operation();
    }
}
