package behavioralPatterns.chainOfResponsibilityPattern.code;

public abstract class LeaveHandler {
    protected int leaveDays;
    protected LeaveHandler nextLeaveHandler;

    public void setLeaveDays(int leaveDays) {
        this.leaveDays = leaveDays;
    }

    public void setNextLeaveHandler(LeaveHandler nextLeaveHandler) {
        this.nextLeaveHandler = nextLeaveHandler;
    }

    public abstract void handleLeave(int leaveDays);

}
