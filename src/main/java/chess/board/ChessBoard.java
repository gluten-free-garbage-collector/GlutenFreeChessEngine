package chess.board;

import chess.Party;
import chess.Position;

public class ChessBoard {

    public static final int BOARD_SIZE = 8;
    private final PieceData[][] board;

    public ChessBoard() {
        this.board = new PieceData[BOARD_SIZE][BOARD_SIZE];
    }

    /**
     * Retruns the PieceData for a given position. Returns null if there is no
     * piece at that position or if the position is null.
     *
     * @param pos the position
     * @return the piece at that position
     */
    public PieceData getPiece(Position pos) {
        if (pos != null) {
            return this.board[pos.getA()][pos.getB()];
        } else {
            return null;
        }

    }

    /**
     * Maps a position to a piece.
     *
     * @param pos   where to put the piece
     * @param piece which piece to put there
     */
    private void setPiece(Position pos, PieceData piece) {
        if (pos != null) {
            this.board[pos.getA()][pos.getB()] = piece;
        }
    }

    /**
     * Maps a new position to a piece and unmaps an old one. Only use from
     * within PieceData. Use PieceData's method everywhere else.
     *
     * @param piece the piece at it's new position
     * @param from  from wherewhere
     * @return the piece that was moved
     * @deprecated i think we won't need this
     */
    void movePiece(PieceData piece, Position from) {
        setPiece(from, null);
        setPiece(piece.getPos(), piece);
    }

    /**
     * Maps a piece's position to the piece.
     *
     * @param piece the piece to add mappings for
     */
    void addPiece(PieceData piece) {
        setPiece(piece.getPos(), piece);
    }

    /**
     * Unmapps a piece's position from the piece.
     *
     * @param piece the piece to remove mappings for
     */
    void removePiece(PieceData piece) {
        setPiece(piece.getPos(), null);
    }

    /**
     * Determines whether a given Position is occupied.
     *
     * @param position the position to check
     * @return true if there is a Piece at the Position
     */
    public boolean isEmpty(Position position) {
        return this.board[position.getA()][position.getB()] == null;
    }

    /**
     * Determines whether a player can remove a piece at a given Position.
     *
     * @param position the position to check
     * @param by       the party of the capturing player
     * @return true if there is a Piece at position and it is not if the given party
     */
    public boolean isCapturable(Position position, Party by) {
        if (isEmpty(position)) {
            return false;
        }
        return this.board[position.getA()][position.getB()].getParty() != by;
    }

}
