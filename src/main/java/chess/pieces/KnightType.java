package chess.pieces;

import chess.Party;
import chess.Position;
import chess.moves.Move;

import java.util.List;

public class KnightType extends PieceType{
    public KnightType(Party party, Position pos) {
        super(party, pos);
    }

    @Override
    public List<Move> generatePossibleMoves() {
        return null;
    }
}
