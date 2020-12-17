package behavioralPatterns.observerPattern.code;

public class Meteorologist implements Observer {
    private Subject subject;

    @Override
    public void update(Subject subject) {
        this.subject = subject;
        say();
    }

    public void say() {
        System.out.println(toString() + " said : the subject is changed");
        System.out.println(subject.toString());
    }

}
