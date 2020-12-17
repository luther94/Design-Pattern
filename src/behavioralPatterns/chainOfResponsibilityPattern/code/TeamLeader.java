package behavioralPatterns.chainOfResponsibilityPattern.code;

public class TeamLeader extends LeaveHandler {
    public TeamLeader() {
        setLeaveDays(1);
        setNextLeaveHandler(new DepartmentLeader());
    }

    @Override
    public void handleLeave(int leaveDays) {
        System.out.println("请假天数" + leaveDays + ",组长已同意");
        if (leaveDays > this.leaveDays && nextLeaveHandler != null) nextLeaveHandler.handleLeave(leaveDays);
    }
}
