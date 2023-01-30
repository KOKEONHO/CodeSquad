package masters.cs16.cs06.model.pieces;

import java.util.List;

public class Pawn implements Piece {

    final String color;
    private static int pawnCode = 0;


    public Pawn(String color) {
        this.color = color;
        pawnCode++;
    }

    @Override
    public List<String> possiblePositions() {
        return null;
    }
}
