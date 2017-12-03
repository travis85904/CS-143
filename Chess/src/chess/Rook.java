// rook = castle
package chess;

public class Rook extends ChessPiece {
    private int pieceLocX, pieceLocY, moveLocX, moveLocY;

    public Rook(Color color) {
        super(color);
    }

    public Rook getPiece() {
        return this;
    }

    @Override
    public boolean legalMove(ChessPiece[][] board, int pieceLocX, int pieceLocY, int moveLocX, int moveLocY) {
        if (!pathClear(board, pieceLocX, pieceLocY, moveLocX, moveLocY)) return false;
        if (pieceLocX != moveLocX && pieceLocY != moveLocY)//checks that the rook is only moving along 1 axis
            return false;
        return true;
    }

    @SuppressWarnings("Duplicates")
    public boolean pathClear(ChessPiece[][] board, int pieceLocX, int pieceLocY, int moveLocX, int moveLocY) {
        if (pieceLocY == moveLocY) {
            if (pieceLocX > moveLocX) {
                for (int i = (pieceLocX - 1); i > moveLocX; i--) {
                    if (board[i][pieceLocY] != null) {
                        return false;
                    }
                }
            } else if (pieceLocX < moveLocX) {
                for (int i = (pieceLocX + 1); i < moveLocX; i++) {
                    if (board[i][pieceLocY] != null) {
                        return false;
                    }
                }
            }
        } else if (pieceLocX == moveLocX) {
            if (pieceLocY > moveLocY) {
                for (int i = (pieceLocY - 1); i > moveLocY; i--) {
                    if (board[pieceLocX][i] != null) {
                        return false;
                    }
                }
            } else if (pieceLocY < moveLocY) {
                for (int i = (pieceLocY + 1); i < moveLocY; i++) {
                    if (board[pieceLocX][i] != null) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return (color == Color.white) ? "R" : "r";
    }
}
