package creationalPatterns.factoryPattern.code.factoryMethod;

public class App {
    public static void main(String[] args) {
        Factory factory = new CircleFactory();
        factory.createShape().shapeDesc();

        factory = new RectangleFactory();
        factory.createShape().shapeDesc();

        factory = new SquareFactory();
        factory.createShape().shapeDesc();
    }
}
