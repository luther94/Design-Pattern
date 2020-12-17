package structuralPatterns.flyweightPattern.code;

public class WeiqiFactory {
    private static ChessPieces blackPieces = new BlackPieces();
    private static ChessPieces whitePieces = new WhitePieces();

    public static ChessPieces getChessPieces(String color) {
        return "black".equals(color) ? blackPieces : whitePieces;
    }
}
