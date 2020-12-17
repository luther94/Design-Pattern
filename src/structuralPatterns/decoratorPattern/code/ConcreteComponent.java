package structuralPatterns.decoratorPattern.code;

public class ConcreteComponent implements Component {
    @Override
    public void say() {
        System.out.println("hi");
    }
}
