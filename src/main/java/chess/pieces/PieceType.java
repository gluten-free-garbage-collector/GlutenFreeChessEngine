package chess.pieces;

import chess.Party;
import chess.Position;
import chess.moves.Move;
import java.util.List;

public abstract class PieceType {

    private final Party party;
    private Position pos;

    public PieceType(Party party, Position pos) {
        this.party = party;
        this.pos = pos;
    }

    public Position getPos() {
        return pos;
    }

    public void setPos(Position pos) {
        this.pos = pos;
    }

    public Party getParty() {
        return party;
    }

    public abstract List<Move> generatePossibleMoves();

    public boolean isEnPassantable() {
        return false;
    }
}
