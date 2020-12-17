package creationalPatterns.factoryPattern.code.simpleFactory;

public class ShapeFactory {

    public Shape getShape(ShapeType shapeType) {
        return shapeType.getConstructor().get();
    }

}
