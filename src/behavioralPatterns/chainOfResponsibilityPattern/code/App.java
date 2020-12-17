package behavioralPatterns.chainOfResponsibilityPattern.code;

public class App {
    public static void main(String[] args) {
        TeamLeader teamLeader = new TeamLeader();
        teamLeader.handleLeave(1);
        System.out.println("-----------------------------------");
        teamLeader.handleLeave(3);
        System.out.println("-----------------------------------");
        teamLeader.handleLeave(5);
    }
}
