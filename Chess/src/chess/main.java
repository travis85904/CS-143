//Travis Davis
//Kevin Blair

package chess;

public class main {

    private static ChessBoard chessBoard = new ChessBoard();

    public static void main(String[] args) throws Exception {

        System.out.println(chessBoard);
        //chessBoard.setPiece(5,3, new Bishop(Color.white));
        //move("d3","d7");
        chessBoard.move("a2","a4");
        chessBoard.move("b2", "b4");
        chessBoard.move("c1", "a3");


        System.out.println(chessBoard);

    }

}
