package chess.board;

import chess.Position;
import chess.exception.ChessException;
import chess.pieces.PieceType;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ChessBoard {

    public static final int BOARD_SIZE = 8;
    private final PieceType[][] board;
    private Map<PieceType, Set<Position>> piecePositions;

    public ChessBoard() {
        board = new PieceType[BOARD_SIZE][BOARD_SIZE];
        piecePositions = new HashMap<>();
    }

    public PieceType getPiece(Position pos) {
        if (pos != null) {
            return board[pos.getA()][pos.getB()];
        } else {
            return null;
        }

    }

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

}
