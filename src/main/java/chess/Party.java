package chess;

public class Party {
    public static final Party WHITE = new Party("white", new Position(0,1));
    public static final Party BLACK = new Party("black", new Position(0,-1));

    private String name;
    private Position forward;

    private Party(String name, Position forward) {
        this.name = name;
        this.forward = forward;
    }
}
