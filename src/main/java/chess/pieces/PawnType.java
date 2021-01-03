package chess.pieces;

import chess.Position;
import chess.board.ChessBoard;
import chess.board.PieceData;
import chess.moves.CaptureMove;
import chess.moves.Move;
import chess.moves.MoveMove;
import java.util.ArrayList;
import java.util.List;

public class PawnType extends PieceType {

    PawnType() {
    }

    @Override
    public List<Move> generatePossibleMoves(PieceData data) {
        ChessBoard board = data.getBoard();
        List<Move> moves = new ArrayList<>();
        Position forward = data.getPos().add(data.getParty().getForward());
        if (board.isEmpty(forward)) {
            moves.add(new MoveMove(data.getPos(), forward));
        }

        addCaptureMove(data, moves, new Position(-1, 0));
        addCaptureMove(data, moves, new Position(1, 0));

        if (!data.hasMoved()) {
            Position check = data.getPos().add(data.getParty().getForward());
            if (board.isEmpty(check)) {
                check = check.add(data.getParty().getForward());
                if (board.isEmpty(check)) {
                    moves.add(new MoveMove(data.getPos(), check));
                }
            }
        }

        return moves;
    }

    private void addCaptureMove(PieceData data, List<Move> moves, Position direction) {
        Position capture = data.getPos().add(data.getParty().getForward()).add(direction);
        if (data.getBoard().isCapturable(capture, data.getParty())) {
            moves.add(new CaptureMove(data.getPos(), capture));
        }
    }

    @Override
    public String toString() {
        return "Pawn";
    }
}
