package chess;

public class Knight extends ChessPiece {

    public Knight(Color color) {
        super(color);
    }

    public Knight getPiece() {
        return this;
    }

    @Override
    public boolean legalMove(ChessPiece[][] board, int pieceLocX, int pieceLocY, int moveLocX, int moveLocY) {
        if (!checkPath(board, pieceLocX, pieceLocY, moveLocX, moveLocY)) return false;
        return true;
    }

    @Override
    public boolean checkPath(ChessPiece[][] board, int pieceLocX, int pieceLocY, int moveLocX, int moveLocY) {
        return false;
    }

    @Override
    public String toString() {
        return (color == Color.white) ? "K" : "k";
    }
}
