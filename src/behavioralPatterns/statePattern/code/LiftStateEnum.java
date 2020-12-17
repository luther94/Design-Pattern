package behavioralPatterns.statePattern.code;

import java.util.function.Supplier;

public enum LiftStateEnum {
    OPENING(OpeningState::new),
    CLOSING(ClosingState::new),
    RUNNING(RunningState::new),
    STOPPING(StoppingState::new);

    public Supplier<LiftState> constructor;

    LiftStateEnum(Supplier<LiftState> constructor) {
        this.constructor = constructor;
    }

    public Supplier<LiftState> getConstructor() {
        return constructor;
    }

    public void setConstructor(Supplier<LiftState> constructor) {
        this.constructor = constructor;
    }
}
