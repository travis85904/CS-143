//Travis Davis
//Kevin Blair

package chess;

public class main {

    private static ChessBoard chessBoard = new ChessBoard();

    public static void main(String[] args) throws Exception {

        System.out.println(chessBoard);
        //chessBoard.setPiece(5,3, new Bishop(Color.white));
        //move("d3","d7");
        move("a2","a3");


        System.out.println(chessBoard);

    }

    public static void move(String pieceLocation, String move) throws Exception {
        int[] locationAry = ChessUtil.coordsToArray(pieceLocation);
        int[] moveAry = ChessUtil.coordsToArray(move);
        System.out.println("MOVE: ");
        for (int i : moveAry) {
            System.out.println("MOVE "+i);
        }
        chessBoard.move(locationAry, moveAry);

    }
}
