package behavioralPatterns.templatePattern.code;

public class MilkCoffee extends HotDrinks {
    @Override
    protected void brewDrinks() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    protected void addSpices() {
        System.out.println("Pour milk into the coffee");
    }
}
