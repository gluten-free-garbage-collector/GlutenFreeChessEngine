package chess.pieces;

import chess.Party;
import chess.Position;
import chess.moves.Move;

import java.util.List;

public class RookType extends PieceType{
    public RookType(Party party, Position pos) {
        super(party, pos);
    }

    @Override
    public List<Move> generatePossibleMoves() {
        return null;
    }
}
