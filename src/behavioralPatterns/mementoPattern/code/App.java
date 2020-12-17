package behavioralPatterns.mementoPattern.code;

import java.awt.Point;

public class App {
    public static void main(String[] args) {
        Caretaker whiteCaretaker = new Caretaker();
        Originator whiteOriginator = new Originator("张三");

        Caretaker blackCaretaker = new Caretaker();
        Originator blackOriginator = new Originator("李四");

        blackOriginator.play(blackCaretaker, new Point(10, 12), "101");
        whiteOriginator.play(whiteCaretaker, new Point(10, 13), "102");
        blackOriginator.play(blackCaretaker, new Point(11, 12), "101");
        whiteOriginator.play(whiteCaretaker, new Point(11, 13), "102");
        blackOriginator.play(blackCaretaker, new Point(12, 12), "101");
        whiteOriginator.play(whiteCaretaker, new Point(12, 13), "102");

        System.out.println("----------战况-----------");
        System.out.println(blackCaretaker);
        System.out.println(whiteCaretaker);
        System.out.println("----------战况-----------");

        whiteOriginator.undo(whiteCaretaker);
        whiteOriginator.play(whiteCaretaker, new Point(13, 12), "102");

        System.out.println("----------悔棋后战况-----------");
        System.out.println(blackCaretaker);
        System.out.println(whiteCaretaker);
        System.out.println("----------悔棋后战况-----------");
    }
}
