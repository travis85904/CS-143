
package chess;

public abstract class ChessPiece {
    private Integer row;
    private Character column;
    protected Color color;

    public ChessPiece(Color color) {
        this.color = color;
    }

    public ChessPiece getPiece() {
        return this;
    }

    public Color getColor() {
        return color;
    }

    public Integer getRow(){return this.row;}

    public Character getColumn(){return this.column;}

    public abstract boolean legalMove(ChessPiece[][] board, int locX, int locY, int movX, int movY);

    public abstract boolean pathClear(ChessPiece[][] board, int pieceLocX, int pieceLocY, int moveLocX, int moveLocY);

    @Override
    public abstract String toString();
}
