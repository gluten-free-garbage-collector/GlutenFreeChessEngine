package chess;

import chess.exception.ChessException;

public final class Position {
    
    private final int a;
    private final int b;

    public Position(int a, int b) {
        this.a = a;
        this.b = b;
        if(a >= ChessBoard.BOARD_SIZE || a < 0 || b >= ChessBoard.BOARD_SIZE || b < 0)
            throw new ChessException(String.format("Position %d/%d is not on the board.", a, b));
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
    
    public Position add(Position pos) {
        return new Position(a + pos.getA(), b + pos.getB());
    }
    
    public Position substract(Position pos) {
        return new Position(a - pos.getA(), b - pos.getB());
    }
    
    private static final String[] chars = {"A", "B", "C", "D", "E", "F", "G", "H"};
    private static final String[] nums = {"1", "2", "3", "4", "5", "6", "7", "8"};

    @Override
    public String toString() {
        return chars[a] + nums[b];
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + this.a;
        hash = 89 * hash + this.b;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Position other = (Position) obj;
        if (this.a != other.a) {
            return false;
        }
        if (this.b != other.b) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
