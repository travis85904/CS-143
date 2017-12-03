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
        if (!pathClear(board, pieceLocX, pieceLocY, moveLocX, moveLocY)) return false;

        if (Math.abs(pieceLocX - moveLocX) == 2 && Math.abs(pieceLocY - moveLocY) == 1)
            return true;
        if (Math.abs(pieceLocY - moveLocY) == 2 && Math.abs(pieceLocX - moveLocX) == 1)
            return true;
        return false;
    }

    @Override
    public boolean pathClear(ChessPiece[][] board, int pieceLocX, int pieceLocY, int moveLocX, int moveLocY) {
        // needs to be implemented
        return true;
    }

    @Override
    public String toString() {
        return (color == Color.white) ? "K" : "k";
    }
}
