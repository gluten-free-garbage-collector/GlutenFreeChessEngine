package chess.board;

import chess.Party;
import chess.Position;
import chess.pieces.PieceType;

/**
 *
 * @author Lennard
 */
public class PieceData {

    private boolean hasMoved; //wether this piece has moved before
    private boolean hasMovedLastTurn; //wether this piece has moved in the last turn
    private Position pos; //position of this piece
    private final PieceType type; //what type this piece is
    private final Party party; //what party this piece belongs to

    public PieceData(Position pos, PieceType type, Party party) {
        this.pos = pos;
        this.type = type;
        this.party = party;
        this.hasMoved = false;
        this.hasMovedLastTurn = false;
    }

    public boolean isHasMoved() {
        return hasMoved;
    }

    public boolean isHasMovedLastTurn() {
        return hasMovedLastTurn;
    }

    public Position getPos() {
        return pos;
    }

    public PieceType getType() {
        return type;
    }

    public Party getParty() {
        return party;
    }

    public void setPos(Position pos) {
        this.pos = pos;
    }

    public void setHasMoved(boolean hasMoved) {
        this.hasMoved = hasMoved;
    }

    public void setHasMovedLastTurn(boolean hasMovedLastTurn) {
        this.hasMovedLastTurn = hasMovedLastTurn;
    }

}
