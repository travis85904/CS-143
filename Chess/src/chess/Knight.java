package chess;

public class Knight extends ChessPiece {
    private ChessPiece[][] board;
    private int pieceLocX, pieceLocY, moveLocX, moveLocY;
    public Knight(Color color) {
        super(color);
    }

    public Knight getPiece() {
        return this;
    }

    @Override
    public boolean legalMove(ChessPiece[][] board, int pieceLocX, int pieceLocY, int moveLocX, int moveLocY) {
        this.pieceLocX = pieceLocX;
        this.pieceLocY = pieceLocY;
        this.moveLocX = moveLocX;
        this.moveLocY = moveLocY;
        return true;
    }

    @Override
    public boolean checkPath() {
        return false;
    }

    @Override
    public String toString() {
        return (color == Color.white) ? "K" : "k";
    }
}
