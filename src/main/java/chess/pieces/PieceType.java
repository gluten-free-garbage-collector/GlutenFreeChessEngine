package chess.pieces;

import chess.board.PieceData;
import chess.moves.Move;
import java.util.List;

public abstract class PieceType {
    public PieceType() {
    }

    public abstract List<Move> generatePossibleMoves(PieceData data);
}
