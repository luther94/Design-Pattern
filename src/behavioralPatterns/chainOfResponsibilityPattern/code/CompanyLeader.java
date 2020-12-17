package behavioralPatterns.chainOfResponsibilityPattern.code;

public class CompanyLeader extends LeaveHandler {
    @Override
    public void handleLeave(int leaveDays) {
        System.out.println("请假天数" + leaveDays + ",总裁已同意");
    }
}
