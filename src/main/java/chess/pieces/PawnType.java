package chess.pieces;

import chess.Party;
import chess.Position;
import chess.board.ChessBoard;
import chess.board.PieceData;
import chess.moves.Move;
import chess.moves.MoveMove;

import java.util.ArrayList;
import java.util.List;

public class PawnType extends PieceType{
    public PawnType(Party party, Position pos) {
        super();
    }

    @Override
    public List<Move> generatePossibleMoves(PieceData data, ChessBoard board) {
        List<Move> moves = new ArrayList<>();
    }
}
