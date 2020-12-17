package structuralPatterns.proxyPattern.dynamicProxy;

public class App {
    public static void main(String[] args) {
        Star proxy = new Agent().getProxy();
        proxy.sing();
        proxy.dance();
    }
}
