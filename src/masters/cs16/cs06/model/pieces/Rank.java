package masters.cs16.cs06.model.pieces;

import java.util.Arrays;

public enum Rank {

    ONE("1", 0),
    TWO("2", 1),
    THREE("3", 2),
    FOUR("4", 3),
    FIVE("5", 4),
    SIX("6", 5),
    SEVEN("7", 6),
    EIGHT("8", 7),
    WRONG("WRONG", -1);

    private final String rank;
    private final int label;

    Rank(String rank, int label) {
        this.rank = rank;
        this.label = label;
    }

    public static int getRankLabel(String rank) {
        return Arrays.stream(Rank.values())
                .filter(chessRank -> chessRank.rank.equals(rank))
                .map(chessRank -> chessRank.label)
                .findAny()
                .orElse(WRONG.label);
    }
}
