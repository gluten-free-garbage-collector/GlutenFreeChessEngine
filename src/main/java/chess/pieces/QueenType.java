package chess.pieces;

import chess.Party;
import chess.Position;
import chess.board.ChessBoard;
import chess.board.PieceData;
import chess.moves.Move;

import java.util.List;

public class QueenType extends PieceType{
    public QueenType(Party party, Position pos) {
        super();
    }

    @Override
    public List<Move> generatePossibleMoves(PieceData data, ChessBoard board) {
        return null;
    }
}
