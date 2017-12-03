package chess;

public class Queen extends ChessPiece {
    public Queen(Color color) {
        super(color);
    }

    public Queen getPiece() {
        return this;
    }

    @Override
    public boolean legalMove(ChessPiece[][] board, int pieceLocX, int pieceLocY, int moveLocX, int moveLocY) {
        if (!pathClear(board, pieceLocX, pieceLocY, moveLocX, moveLocY)) return false;
        if (pieceLocX != moveLocX && pieceLocY != moveLocY) {
            if (Math.abs(pieceLocX - moveLocX) != Math.abs(pieceLocY - moveLocY))
                return false;
        }
        return true;
    }

    @Override
    public boolean pathClear(ChessPiece[][] board, int pieceLocX, int pieceLocY, int moveLocX, int moveLocY) {
        if (Math.abs(pieceLocX - moveLocX) != Math.abs(pieceLocY - moveLocY)) {
            return new Bishop(Color.white).pathClear(board, pieceLocX, pieceLocY, moveLocX, moveLocY);
        } else
            return new Rook(Color.white).pathClear(board, pieceLocX, pieceLocY, moveLocX, moveLocY);
    }

    @Override
    public String toString() {
        return (color == Color.white) ? "Q" : "q";
    }
}
