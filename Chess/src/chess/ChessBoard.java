package chess;

public class ChessBoard {
    private ChessPiece[][] board = new ChessPiece[8][8];
    //private int pieceLocX, pieceLocY, moveLocX, moveLocY;
    private Color lastMoveColor;

    public ChessBoard() {

        board[0][0] = new Rook(Color.white);
        board[0][1] = new Knight(Color.white);
        board[0][2] = new Bishop(Color.white);
        board[0][3] = new King(Color.white);
        board[0][4] = new Queen(Color.white);
        board[0][5] = new Bishop(Color.white);
        board[0][6] = new Knight(Color.white);
        board[0][7] = new Rook(Color.white);

        board[7][0] = new Rook(Color.black);
        board[7][1] = new Knight(Color.black);
        board[7][2] = new Bishop(Color.black);
        board[7][3] = new Queen(Color.black);
        board[7][4] = new King(Color.black);
        board[7][5] = new Bishop(Color.black);
        board[7][6] = new Knight(Color.black);
        board[7][7] = new Rook(Color.black);

        for (int col = 0; col < 8; col++) {
            board[1][col] = new Pawn(Color.white);
        }
        for (int col = 0; col < 8; col++) {
            board[6][col] = new Pawn(Color.black);
        }
    }

    public void clearBoard() {
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                board[row][col] = null;
            }
        }
    }

    public ChessPiece getPiece(int x, int y) {
        return board[x][y];
    }

    public void setPiece(int x, int y, ChessPiece piece) {
        board[x][y] = piece;
    }

    public void move(String pieceLocation, String move) {
        int[] locAry = ChessUtil.coordsToArray(pieceLocation);
        int[] movAry = ChessUtil.coordsToArray(move);
        int pieceLocX, pieceLocY, moveLocX, moveLocY;

        pieceLocX = locAry[0];//location of the piece to be moved
        pieceLocY = locAry[1];
        moveLocX = movAry[0];//desired location to move the piece to
        moveLocY = movAry[1];

        ChessPiece piece = board[pieceLocX][pieceLocY];

        if (checkSpot(pieceLocX, pieceLocY, moveLocX, moveLocY) && piece.legalMove(board, pieceLocX, pieceLocY, moveLocX, moveLocY)) {
            if (board[moveLocX][moveLocY] != null && !legalCapture(pieceLocX, pieceLocY, moveLocX, moveLocY)) {
                return;
            }

            board[moveLocX][moveLocY] = board[pieceLocX][pieceLocY];
            board[pieceLocX][pieceLocY] = null;
            lastMoveColor = board[moveLocX][moveLocY].color;
        }
    }

    public boolean legalCapture(int pieceLocX, int pieceLocY, int moveLocX, int moveLocY) {
        Color pieceColor = board[pieceLocX][pieceLocY].getColor();
        Color moveColor = board[moveLocX][moveLocY].getColor();
        ChessPiece piece = board[pieceLocX][pieceLocY];

        if (piece.equals(Pawn.class)) {
            if (pieceLocY == moveLocY)
                return false;
        }
        if (pieceColor == moveColor) { //Make sure you are capturing a piece of the opposite color
            return false;
        }
        return true;
    }

    public boolean checkSpot(int pieceLocX, int pieceLocY, int moveLocX, int moveLocY) {
        if (moveLocX == pieceLocX && moveLocY == pieceLocY) { // Make sure the move location is not the same as the piece location
            System.out.println("ERROR: The piece is already in the specified location");
            return false;
        } else if (board[pieceLocX][pieceLocY] == null) { //Check that a piece is at pieceLocX, pieceLocY
            System.out.println("ERROR: No piece exists in the specified location");
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            for (ChessPiece spot : board[i]) {
                if (spot == null)
                    sb.append(".");
                else
                    sb.append(spot);
            }
            sb.append("\n");
        }
        String board = sb.toString();
        return board;
    }
}
