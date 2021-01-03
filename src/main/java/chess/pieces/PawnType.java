package chess.pieces;

import chess.Party;
import chess.Position;
import chess.board.PieceData;
import chess.moves.Move;

import java.util.List;

public class PawnType extends PieceType{
    public PawnType(Party party, Position pos) {
        super();
    }

    @Override
    public List<Move> generatePossibleMoves(PieceData data) {
        return null;
    }
}
