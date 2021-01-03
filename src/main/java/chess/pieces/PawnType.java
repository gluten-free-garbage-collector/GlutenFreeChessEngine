package chess.pieces;

import chess.Position;
import chess.board.ChessBoard;
import chess.board.PieceData;
import chess.moves.Move;
import chess.moves.MoveMove;

import java.util.ArrayList;
import java.util.List;

public class PawnType extends PieceType {
    PawnType() {
    }

    @Override
    public List<Move> generatePossibleMoves(PieceData data, ChessBoard board) {
        List<Move> moves = new ArrayList<>();
        Position forward = data.getPos().add(data.getParty().getForward());
        if (board.getPiece(forward) == null) {
            moves.add(new MoveMove(data.getPos(), forward));
        }
        return moves;
    }

    @Override
    public String toString() {
        return "Pawn";
    }
}
