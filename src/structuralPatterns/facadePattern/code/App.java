package structuralPatterns.facadePattern.code;

public class App {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.method1();
        facade.method2();
        facade.method3();
    }
}
