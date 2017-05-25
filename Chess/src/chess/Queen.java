package chess;

public class Queen extends ChessPiece {
    private ChessPiece[][] board;
    private int pieceLocX, pieceLocY, moveLocX, moveLocY;
    public Queen(Color color) {
        super(color);
    }
    public Queen getPiece(){return this;}

    @Override
    public boolean legalMove(ChessPiece[][] board, int pieceLocX, int pieceLocY, int moveLocX, int moveLocY) {
        this.pieceLocX = this.pieceLocX;
        this.pieceLocY = this.pieceLocY;
        this.moveLocX = this.moveLocX;
        this.moveLocY = this.moveLocY;
        return true;
    }

    @Override
    public boolean checkPath() {
        return false;
    }
    @Override
    public String toString() {
        return (color == Color.white) ? "Q" : "q";
    }
}
