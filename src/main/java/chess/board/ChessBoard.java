package chess.board;

import chess.Position;
import chess.exception.ChessException;

public class ChessBoard {

    public static final int BOARD_SIZE = 8;
    private final PieceData[][] board;

    public ChessBoard() {
        board = new PieceData[BOARD_SIZE][BOARD_SIZE];
    }

    /**
     * Retruns the PieceData for a given position. Returns null if there is no
     * piece at that psoition or if the position is null.
     *
     * @param pos the position
     * @return the piece at that position
     */
    public PieceData getPiece(Position pos) {
        if (pos != null) {
            return board[pos.getA()][pos.getB()];
        } else {
            return null;
        }

    }

    /**
     *
     * @param pos
     * @return
     */
    protected void setPiece(Position pos, PieceData piece) {
        if (pos != null) {
            board[pos.getA()][pos.getB()] = piece;
        }

    }

    /**
     * Moves a Piece.
     *
     * @param from from where
     * @param to to where
     * @return the piece that was moved
     */
    PieceData movePiece(Position from, Position to) {
        if (getPiece(to) != null) {
            throw new ChessException(String.format("Tried to add piece to occupied field: %s", to.toString()));
        }
        PieceData piece = getPiece(from);
        piece.setPos(to);
        setPiece(from, null);
        setPiece(to, piece);
        return piece;
    }

    /*
    public void addPiece(Position pos, PieceType piece) {
        if (getPiece(pos) != null) {
            throw new ChessException(String.format("Tried to add piece to occupied field: %s", pos.toString()));
        }

        board[pos.getA()][pos.getB()] = piece;
        piecePositions.get(piece).add(pos);
    }

    public PieceData removePiece(Position pos) {
        if (getPiece(pos) == null) {
            throw new ChessException(String.format("Tried to remove piece from emtpty field: %s", pos.toString()));
        }
        PieceData piece = getPiece(pos);
        piecePositions.get(piece).remove(pos);
        board[pos.getA()][pos.getB()] = null;
        return piece;
    }

    public PieceData movePiece(Position before, Position after) {
        PieceData piece = removePiece(before);
        addPiece(after, piece);
        return piece;
    }
     */
}
