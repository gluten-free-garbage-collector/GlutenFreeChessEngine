package chess.pieces;

import chess.board.ChessBoard;
import chess.board.PieceData;
import chess.moves.Move;

import java.util.List;

public class QueenType extends PieceType {
    QueenType() {
    }

    @Override
    public List<Move> generatePossibleMoves(PieceData data) {
        return null;
    }

    @Override
    public String toString() {
        return "Queen";
    }
}
