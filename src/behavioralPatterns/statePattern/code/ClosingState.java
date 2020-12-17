package behavioralPatterns.statePattern.code;

public class ClosingState extends LiftState {
    @Override
    public void open() {
        this.context.setLiftState(LiftStateEnum.OPENING.getConstructor().get());
        this.context.getLiftState().open();
    }

    @Override
    public void close() {
        System.out.println("电梯门关闭了");
    }

    @Override
    public void run() {
        this.context.setLiftState(LiftStateEnum.RUNNING.getConstructor().get());
        this.context.getLiftState().run();
    }

    @Override
    public void stop() {

    }
}
