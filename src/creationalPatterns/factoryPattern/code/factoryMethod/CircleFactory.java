package creationalPatterns.factoryPattern.code.factoryMethod;

public class CircleFactory implements Factory {
    @Override
    public Shape createShape() {
        return new Circle();
    }
}
