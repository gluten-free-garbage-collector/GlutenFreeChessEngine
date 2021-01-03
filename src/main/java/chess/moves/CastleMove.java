package chess.moves;

import chess.ChessBoard;
import chess.Position;

public class CastleMove extends Move {

    private Position kingFrom;
    private Position kingTo;
    private Position rookFrom;
    private Position rookTo;

    public CastleMove() {

    }

    @Override
    public void apply(ChessBoard board) {
        board.movePiece(kingFrom, kingTo);
        board.movePiece(rookFrom, rookTo);
    }

}
