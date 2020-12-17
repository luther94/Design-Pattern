package structuralPatterns.flyweightPattern.code;

import java.awt.*;

public class BlackPieces implements ChessPieces {

    @Override
    public void play(Point point) {
        System.out.println("黑棋下在了坐标{" + point.x + "," + point.y + "}处");
    }
}
