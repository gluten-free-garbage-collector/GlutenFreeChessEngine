package chess.moves;

import chess.board.ChessBoard;
import chess.Position;

public class CaptureMove extends Move {

    private Position from;
    private Position to;
    private Position capture;

    public CaptureMove(Position from, Position to) {
        this.from = from;
        this.to = to;
        this.capture = to;
    }

    public CaptureMove(Position from, Position to, Position capture) {
        this.from = from;
        this.to = to;
        this.capture = capture;
    }

    @Override
    public void apply(ChessBoard board) {
        board.removePiece(capture);
        board.movePiece(from, to);
    }

}
