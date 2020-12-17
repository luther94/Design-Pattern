package behavioralPatterns.statePattern.code;

public class OpeningState extends LiftState {
    @Override
    public void open() {
        System.out.println("电梯门打开了");
    }

    @Override
    public void close() {
        this.context.setLiftState(LiftStateEnum.CLOSING.getConstructor().get());
        this.context.getLiftState().close();
    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {

    }
}
