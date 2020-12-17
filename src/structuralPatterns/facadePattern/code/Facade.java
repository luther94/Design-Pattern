package structuralPatterns.facadePattern.code;

public class Facade {
    private SubSystem01 subSystem01 = new SubSystem01();
    private SubSystem02 subSystem02 = new SubSystem02();
    private SubSystem03 subSystem03 = new SubSystem03();

    public void method1() {
        subSystem01.method1();
    }

    public void method2() {
        subSystem02.method2();
    }

    public void method3() {
        subSystem03.method3();
    }
}
