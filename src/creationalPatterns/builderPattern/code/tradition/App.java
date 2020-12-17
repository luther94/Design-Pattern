package creationalPatterns.builderPattern.code.tradition;

public class App {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder2();
        Director director = new Director(builder);
        Product product = director.getProduct();
        System.out.println(product);

        builder = new ConcreteBuilder1();
        director = new Director(builder);
        product = director.getProduct();
        System.out.println(product);
    }
}
