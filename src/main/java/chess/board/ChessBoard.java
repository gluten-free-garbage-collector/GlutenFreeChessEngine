package chess.board;

import chess.Position;
import chess.pieces.PieceType;

public class ChessBoard {

    public static final int BOARD_SIZE = 8;
    private final PieceData[][] board;

    public ChessBoard() {
        board = new PieceData[BOARD_SIZE][BOARD_SIZE];
    }

    public PieceType getPiece(Position pos) {
        if (pos != null) {
            return board[pos.getA()][pos.getB()];
        } else {
            return null;
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
            throw new ChessException(String.format("Tried to add piece to occupied field: %s", pos.toString()));
        }
        PieceData piece = getPiece(from);
    }

    /*
    public void addPiece(Position pos, PieceType piece) {
        if (getPiece(pos) != null) {
            throw new ChessException(String.format("Tried to add piece to occupied field: %s", pos.toString()));
        }

        board[pos.getA()][pos.getB()] = piece;
        piecePositions.get(piece).add(pos);
    }

    public PieceType removePiece(Position pos) {
        if (getPiece(pos) == null) {
            throw new ChessException(String.format("Tried to remove piece from emtpty field: %s", pos.toString()));
        }
        PieceType piece = getPiece(pos);
        piecePositions.get(piece).remove(pos);
        board[pos.getA()][pos.getB()] = null;
        return piece;
    }

    public PieceType movePiece(Position before, Position after) {
        PieceType piece = removePiece(before);
        addPiece(after, piece);
        return piece;
    }
     */
}
