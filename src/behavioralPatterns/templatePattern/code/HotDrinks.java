package behavioralPatterns.templatePattern.code;

public abstract class HotDrinks {

    protected final void makeHotDrink() {
        boilWater();
        brewDrinks();
        pourInCup();
        addSpices();
    }

    protected final void boilWater() {
        System.out.println("Boiling water");
    }

    protected abstract void brewDrinks();

    protected final void pourInCup() {
        System.out.println("Pouring into cup");
    }

    protected abstract void addSpices();
}
