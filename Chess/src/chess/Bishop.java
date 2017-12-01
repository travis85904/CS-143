package chess;

public class Bishop extends ChessPiece {
    public Bishop(Color color) {
        super(color);
    }

    public Bishop getPiece() {
        return this;
    }

    @Override
    public boolean legalMove(ChessPiece[][] board, int pieceLocX, int pieceLocY, int moveLocX, int moveLocY) {

        if (!checkPath(board, pieceLocX, pieceLocY, moveLocX, moveLocY)) return false;
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
    public boolean checkPath(ChessPiece[][] board, int pieceLocX, int pieceLocY, int moveLocX, int moveLocY) {
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
