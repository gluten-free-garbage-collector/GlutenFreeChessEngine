package chess.pieces;

import chess.Party;
import chess.Position;
import chess.board.PieceData;
import chess.moves.Move;

import java.util.List;

public class KnightType extends PieceType{
    public KnightType(Party party, Position pos) {
        super();
    }

    @Override
    public List<Move> generatePossibleMoves(PieceData data) {
        return null;
    }
}
