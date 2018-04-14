/**
 * Travis Davis - 4/13/18
 */
package chess;

import java.util.HashMap;

public class _ChessBoardMap {
    private HashMap<Character, Integer> board;
    protected Color color;

    public _ChessBoardMap(ChessPiece chessPiece){
        board.put(chessPiece.getColumn(), chessPiece.getRow());
    }
}
