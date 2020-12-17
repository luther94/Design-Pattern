package behavioralPatterns.templatePattern.code;

public class Tea extends HotDrinks {
    @Override
    protected void brewDrinks() {
        System.out.println("Steeping the tea");
    }

    @Override
    protected void addSpices() {
        System.out.println("Adding lemon");
    }
}
