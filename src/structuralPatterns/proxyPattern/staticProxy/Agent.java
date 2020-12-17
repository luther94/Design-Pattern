package structuralPatterns.proxyPattern.staticProxy;

public class Agent implements Star {
    private SingStar singStar;

    public Agent() {
        singStar = new SingStar();
    }

    @Override
    public void sing() {
        System.out.println("演唱会20万一场");
        singStar.sing();
        System.out.println("演唱会完毕");
    }

    @Override
    public void dance() {
        System.out.println("跳舞请求不接");
    }
}
