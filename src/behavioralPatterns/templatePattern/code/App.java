package behavioralPatterns.templatePattern.code;

public class App {
    public static void main(String[] args) {
        HotDrinks hotDrinks = new MilkCoffee();
        hotDrinks.makeHotDrink();

        hotDrinks = new Tea();
        hotDrinks.makeHotDrink();
    }
}
