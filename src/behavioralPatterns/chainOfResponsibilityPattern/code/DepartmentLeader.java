package behavioralPatterns.chainOfResponsibilityPattern.code;

public class DepartmentLeader extends LeaveHandler {
    public DepartmentLeader() {
        setLeaveDays(3);
        setNextLeaveHandler(new CompanyLeader());
    }

    @Override
    public void handleLeave(int leaveDays) {
        System.out.println("请假天数" + leaveDays + ",部长已同意");
        if (leaveDays > this.leaveDays && nextLeaveHandler != null) nextLeaveHandler.handleLeave(leaveDays);
    }
}
