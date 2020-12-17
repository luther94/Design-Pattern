package structuralPatterns.proxyPattern.staticProxy;

public class App {
    public static void main(String[] args) {
        Agent agent = new Agent();
        agent.sing();
        agent.dance();
    }
}
