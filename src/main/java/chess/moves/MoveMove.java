package chess.moves;

import chess.ChessBoard;
import chess.Position;

public class MoveMove extends Move {

    private Position from;
    private Position to;

    public MoveMove(Position from, Position to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void apply(ChessBoard board) {
        board.movePiece(from, to);

    }

}
