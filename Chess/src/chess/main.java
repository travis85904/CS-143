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


        System.out.println(chessBoard);

    }

}
