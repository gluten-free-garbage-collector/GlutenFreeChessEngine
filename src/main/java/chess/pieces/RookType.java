package chess.pieces;

import chess.board.ChessBoard;
import chess.board.PieceData;
import chess.moves.Move;

import java.util.List;

public class RookType extends PieceType {
    public RookType() {
    }

    @Override
    public List<Move> generatePossibleMoves(PieceData data) {
        return null;
    }

    @Override
    public String toString() {
        return "Rook";
    }
}
