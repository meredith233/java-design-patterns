package decorator.template;

/**
 * @author liangjuhong
 * @since 2021/8/17
 */
public abstract class Decorator extends Component {
    
    protected Component component;
    
    public Decorator(Component component) {
        this.component = component;
    }
    
    @Override
    public void operation() {
        component.operation();
    }
}
