package behavioralPatterns.statePattern.code;

public class App {
    public static void main(String[] args) {
        Context context = new Context();
        context.setLiftState(LiftStateEnum.CLOSING.getConstructor().get());
        context.open();
        context.close();
        context.run();
        context.stop();
    }
}
