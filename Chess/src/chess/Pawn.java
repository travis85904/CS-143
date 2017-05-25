package chess;

public class Pawn extends ChessPiece {
    private ChessPiece[][] board;
    private int pieceLocX, pieceLocY, moveLocX, moveLocY;

    public Pawn(Color color) {
        super(color);
    }

    public Pawn getPiece() {
        return this;
    }

    @Override
    public boolean legalMove(ChessPiece[][] board, int pieceLocX, int pieceLocY, int moveLocX, int moveLocY) {
        this.board = board;
        this.pieceLocX = pieceLocX;
        this.pieceLocY = pieceLocY;
        this.moveLocX = moveLocX;
        this.moveLocY = moveLocY;

        //
        if (pieceLocY != moveLocY) {
            if (board[moveLocX][moveLocY] == null)
                return false;
            if (pieceLocX - moveLocX != 1 || pieceLocX - moveLocX != -1)
                return false;
            if (pieceLocY - moveLocY != 1 || pieceLocY - moveLocY != -1)
                return false;
        }

        return true;
    }

    @Override
    public boolean checkPath() {
        return true;
    }

    @Override
    public String toString() {
        return (color == Color.white) ? "P" : "p";
    }
}
