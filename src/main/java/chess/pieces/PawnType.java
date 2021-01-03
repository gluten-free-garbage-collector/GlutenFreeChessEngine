package chess.pieces;

import chess.Party;
import chess.Position;
import chess.moves.Move;

import java.util.List;

public class PawnType extends PieceType{
    public PawnType(Party party, Position pos) {
        super(party, pos);
    }

    @Override
    public List<Move> generatePossibleMoves() {
        return null;
    }
}
