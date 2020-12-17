package structuralPatterns.bridgePattern.code;

public class App {
    public static void main(String[] args) {
        Color white = new White();
        Shape circle = new Circle();
        circle.setColor(white);
        circle.draw();

        Shape rectangle = new Rectangle();
        rectangle.setColor(white);
        rectangle.draw();
    }
}
