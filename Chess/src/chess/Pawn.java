package chess;

public class Pawn extends ChessPiece {
    public Pawn(Color color) {
        super(color);
    }

    public Pawn getPiece() {
        return this;
    }

    @Override
    public boolean legalMove(ChessPiece[][] board, int pieceLocX, int pieceLocY, int moveLocX, int moveLocY) {
        ChessPiece piece = board[pieceLocX][pieceLocY];
        ChessPiece moveLoc = board[moveLocX][moveLocY];

        if (!pathClear(board, pieceLocX, pieceLocY, moveLocX, moveLocY))
            return false;

        if (pieceLocY == moveLocY && moveLoc != null && moveLoc.color == piece.color)
            return false;

        if (piece.color == Color.white) {
            if (pieceLocX == 1) {
                if (moveLocX - pieceLocX != 1 && moveLocX - pieceLocX != 2)
                    return false;
            } else if (moveLocX - pieceLocX != 1)
                return false;
        }

        if (piece.color == Color.black) {
            if (pieceLocX == 6) {
                if (pieceLocX - moveLocX != 1 && pieceLocX - moveLocX != 2)
                    return false;
            } else if (pieceLocX - moveLocX != 1)
                return false;
        }

        if (pieceLocY != moveLocY) {
            if (moveLoc == null)
                return false;
        }

        return true;
    }

    @Override
    public boolean pathClear(ChessPiece[][] board, int pieceLocX, int pieceLocY, int moveLocX, int moveLocY) {

        return true;
    }

    @Override
    public String toString() {
        return (color == Color.white) ? "P" : "p";
    }
}
