package creationalPatterns.factoryPattern.code.factoryMethod;

public class SquareFactory implements Factory {
    @Override
    public Shape createShape() {
        return new Square();
    }
}
