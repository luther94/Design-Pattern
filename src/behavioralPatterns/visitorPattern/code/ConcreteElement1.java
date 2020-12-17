package behavioralPatterns.visitorPattern.code;

public class ConcreteElement1 implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void doSomething() {
        System.out.println("update the element1");
    }
}
