
package chess;

public abstract class ChessPiece {
    protected Color color;
    //private ChessPiece chessPiece;

    public ChessPiece(Color color) {
        this.color = color;
    }

    public abstract boolean legalMove(ChessPiece[][] board, int locX, int locY, int movX, int movY) ;

    //public abstract void capture(){};

    public ChessPiece getPiece(){return this;}

    public abstract boolean checkPath() ;

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        if (color == null)
            return ".";
        return super.toString();
    }
}
