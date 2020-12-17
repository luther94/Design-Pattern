package behavioralPatterns.visitorPattern.code;

public class ConcreteVisitor implements Visitor {
    @Override
    public void visit(ConcreteElement1 el1) {
        el1.doSomething();
    }

    @Override
    public void visit(ConcreteElement2 el2) {
        el2.doSomething();
    }
}
