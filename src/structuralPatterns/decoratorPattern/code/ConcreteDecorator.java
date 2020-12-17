package structuralPatterns.decoratorPattern.code;

public class ConcreteDecorator implements Decorator {
    private Component component;

    public ConcreteDecorator(Component component) {
        this.component = component;
    }

    @Override
    public void say() {
        System.out.println("i am luther");
        component.say();
    }
}
