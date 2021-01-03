package chess.pieces;

import chess.board.ChessBoard;
import chess.board.PieceData;
import chess.moves.Move;

import java.util.List;

public class KnightType extends PieceType {
    public KnightType() {
    }

    @Override
    public List<Move> generatePossibleMoves(PieceData data, ChessBoard board) {
        return null;
    }

    @Override
    public String toString() {
        return "Kight";
    }
}
