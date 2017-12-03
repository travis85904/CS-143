//Travis Davis
//Kevin Blair

package chess;

public class main {

    private static ChessBoard chessBoard = new ChessBoard();

    public static void main(String[] args) throws Exception {

        System.out.println(chessBoard);

        chessBoard.move("a2","a4");
        chessBoard.move("b2", "b4");
        chessBoard.move("c1", "a3");
        chessBoard.move("a1","a2");
        chessBoard.move("a2", "b3");
        chessBoard.move("a4","a5");
        chessBoard.move("d1","c1");
        chessBoard.move("c1", "d2");
        chessBoard.setPiece(2,2, new Queen(Color.black));
        //chessBoard.setPiece(3,3, new Pawn(Color.black));
        chessBoard.move("c6","d5");
        chessBoard.move("d5", "d7");
        chessBoard.setPiece(5,2, new Pawn(Color.black));
        chessBoard.move("b1","c3");




        System.out.println(chessBoard);

    }

}
