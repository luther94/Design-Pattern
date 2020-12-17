package behavioralPatterns.statePattern.code;

public class RunningState extends LiftState {
    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public void run() {
        System.out.println("电梯启动了");
    }

    @Override
    public void stop() {
        this.context.setLiftState(LiftStateEnum.STOPPING.getConstructor().get());
        this.context.getLiftState().stop();
    }
}
