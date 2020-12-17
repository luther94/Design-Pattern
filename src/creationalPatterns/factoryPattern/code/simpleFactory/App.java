package creationalPatterns.factoryPattern.code.simpleFactory;

public class App {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape = shapeFactory.getShape(ShapeType.CIRCLE);
        shape.shapeDesc();

        shape = shapeFactory.getShape(ShapeType.RECTANGLE);
        shape.shapeDesc();

        shape = shapeFactory.getShape(ShapeType.SQUARE);
        shape.shapeDesc();
    }
}
