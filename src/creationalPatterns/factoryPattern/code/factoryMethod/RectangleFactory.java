package creationalPatterns.factoryPattern.code.factoryMethod;

public class RectangleFactory implements Factory {
    @Override
    public Shape createShape() {
        return new Rectangle();
    }
}
