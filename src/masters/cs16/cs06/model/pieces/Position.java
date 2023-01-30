package masters.cs16.cs06.model.pieces;

public class Position {

    private int rank;
    private int file;

    public Position(String file, String rank) {
        this.rank = Rank.getRankLabel(rank);
        this.file = File.getFileLabel(file);
    }

    public Position(int rank, int file) {
        this.rank = rank;
        this.file = file;
    }
}
