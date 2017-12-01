package chess;

public class King extends ChessPiece {

    private boolean xMove, yMove, diagMove;

    public King(Color color) {
        super(color);
    }
    public King getPiece(){return this;}



    @Override
    public boolean legalMove(ChessPiece[][] board, int pieceLocX, int pieceLocY, int moveLocX, int moveLocY) {

        xMove = false;
        yMove = false;
        diagMove = false;
        if (!checkPath(board, pieceLocX, pieceLocY, moveLocX, moveLocY)) return false;
        if ((moveLocX - pieceLocX == 1 || moveLocX - pieceLocX == -1) && moveLocY == pieceLocY) {
            xMove = true;
            return true;
        } else if ((moveLocY - pieceLocY == 1 || moveLocY - pieceLocY == -1) && moveLocX == pieceLocX) {
            yMove = true;
            return true;
        } else if ((moveLocX - pieceLocX == 1 || moveLocX - pieceLocX == -1) && (moveLocY - pieceLocY == 1 || moveLocY - pieceLocY == -1)) {
            diagMove = true;
            return true;
        }

        return false;
    }

    @Override
    public boolean checkPath(ChessPiece[][] board, int pieceLocX, int pieceLocY, int moveLocX, int moveLocY) {

        if (xMove && board[moveLocX][moveLocY] == null) {
            return true;
        } else if (yMove && board[moveLocX][moveLocY] == null) {
            return true;
        } else if (diagMove && board[moveLocX][moveLocY] == null) {
            return true;
        }
        return false;
    }
    @Override
    public String toString() {
        return (color == Color.white) ? "K" : "k";
    }
}
