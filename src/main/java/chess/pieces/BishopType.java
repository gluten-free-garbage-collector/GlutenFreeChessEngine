package chess.pieces;

import chess.Party;
import chess.Position;
import chess.moves.Move;

import java.util.List;

public class BishopType extends PieceType{
    public BishopType(Party party, Position pos) {
        super(party, pos);
    }

    @Override
    public List<Move> generatePossibleMoves() {
        return null;
    }
}
