package chess.pieces;

import chess.board.ChessBoard;
import chess.board.PieceData;
import chess.moves.Move;

import java.util.List;

public abstract class PieceType {
    public static PawnType PAWN = new PawnType();
    public static KnightType KNIGHT = new KnightType();
    public static RookType ROOK = new RookType();
    public static BishopType BISHOP = new BishopType();
    public static QueenType QUEEN = new QueenType();
    public static KnightType KING = new KnightType();

    public abstract List<Move> generatePossibleMoves(PieceData data, ChessBoard board);
}
