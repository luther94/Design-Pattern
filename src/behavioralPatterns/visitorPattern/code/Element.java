package behavioralPatterns.visitorPattern.code;

public interface Element {

    void accept(Visitor visitor);
    void doSomething();

}
