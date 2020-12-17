package structuralPatterns.flyweightPattern.code;

import java.awt.*;

public class WhitePieces implements ChessPieces {
    @Override
    public void play(Point point) {
        System.out.println("白棋下在了坐标{" + point.x + "," + point.y + "}处");
    }
}
