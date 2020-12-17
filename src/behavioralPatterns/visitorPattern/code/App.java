package behavioralPatterns.visitorPattern.code;

public class App {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.add(new ConcreteElement1());
        objectStructure.add(new ConcreteElement1());
        objectStructure.add(new ConcreteElement2());
        objectStructure.accept(new ConcreteVisitor());
    }
}
