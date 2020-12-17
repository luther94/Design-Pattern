package structuralPatterns.flyweightPattern.code;

import java.awt.*;

public class App {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            ChessPieces chessPieces = WeiqiFactory.getChessPieces(i % 2 == 0 ? "black" : "white");
            System.out.println(chessPieces);
            chessPieces.play(new Point(i, i + 2));
            System.out.println();
        }
    }
}
