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
    private final ChessBoard board; //the board this piece is on

    public PieceData(Position pos, PieceType type, Party party, ChessBoard board) {
        this.pos = pos;
        this.type = type;
        this.party = party;
        this.board = board;
        this.hasMoved = false;
        this.hasMovedLastTurn = false;
        board.addPiece(this);
    }

    public void move(Position pos) {
        board.removePiece(this);
        this.pos = pos;
        board.addPiece(this);

    }

    public void remove() {
        board.removePiece(this);
        pos = null;
    }

    public boolean hasMoved() {
        return hasMoved;
    }

    public boolean hasMovedLastTurn() {
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

    public ChessBoard getBoard() {
        return board;
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

    @Override
    public String toString() {
        return String.format("%s %s at %s", party, type, pos);
    }
}
