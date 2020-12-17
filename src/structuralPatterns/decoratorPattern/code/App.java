package structuralPatterns.decoratorPattern.code;

public class App {
    public static void main(String[] args) {
        Component component = new ConcreteDecorator(new ConcreteComponent());
        component.say();
    }
}
