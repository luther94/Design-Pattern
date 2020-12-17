package creationalPatterns.factoryPattern.code.simpleFactory;

import java.util.function.Supplier;

public enum ShapeType {
    CIRCLE(Circle::new),
    SQUARE(Square::new),
    RECTANGLE(Rectangle::new);

    private Supplier<Shape> constructor;

    ShapeType(Supplier<Shape> shapeType) {
        constructor = shapeType;
    }

    Supplier<Shape> getConstructor() {
        return constructor;
    }
}
