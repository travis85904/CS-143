package chess;

public class Bishop extends ChessPiece {
    private ChessPiece[][] board;
    private int pieceLocX, pieceLocY, moveLocX, moveLocY;

    public Bishop(Color color) {
        super(color);
    }

    public Bishop getPiece() {
        return this;
    }

    @Override
    public boolean legalMove(ChessPiece[][] board, int pieceLocX, int pieceLocY, int moveLocX, int moveLocY) {
        this.pieceLocX = pieceLocX;
        this.pieceLocY = pieceLocY;
        this.moveLocX = moveLocX;
        this.moveLocY = moveLocY;
        if (moveLocX > pieceLocX || moveLocX < pieceLocX) {
            if (moveLocY > pieceLocY || moveLocY < pieceLocY) {
                if (Math.abs(moveLocX - pieceLocX) == Math.abs(moveLocY - pieceLocY)) {
                    return true;
                }
                if (Math.abs(moveLocX - pieceLocX) != Math.abs(moveLocY - pieceLocY)) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public boolean checkPath() {
        if (moveLocX > pieceLocX) {
            if (moveLocY > pieceLocY) {
                for (int i = pieceLocX + 1; i < moveLocX; i++) {
                    for (int j = pieceLocY + 1; j < moveLocY; j++) {
                        if (board[i][j] != null)
                            return false;
                    }
                }
            } else if (moveLocY < pieceLocY) {
                for (int i = pieceLocX + 1; i < moveLocX; i++) {
                    for (int j = pieceLocY - 1; j > moveLocY; j--) {
                        if (board[i][j] != null)
                            return false;
                    }
                }
            }
        }
        if (moveLocX < pieceLocX) {
            if (moveLocY > pieceLocY) {
                for (int i = pieceLocX - 1; i > moveLocX; i--) {
                    for (int j = pieceLocY + 1; j < moveLocY; j++) {
                        if (board[i][j] != null)
                            return false;
                    }
                }
            } else if (moveLocY < pieceLocY) {
                for (int i = pieceLocX - 1; i > moveLocX; i--) {
                    for (int j = pieceLocY - 1; j > moveLocY; j--) {
                        if (board[i][j] != null)
                            return false;
                    }
                }
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return (color == Color.white) ? "B" : "b";
    }
}
