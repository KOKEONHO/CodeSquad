package masters.cs16.cs06.model.pieces;

import java.util.Arrays;

public enum File {  // 세로줄 A ~ H
    A("A", 0),
    B("B", 1),
    C("C", 2),
    D("D", 3),
    E("E", 4),
    F("F", 5),
    G("G", 6),
    H("H", 7),
    WRONG("WRONG", -1);

    private final String file;
    private final int label;

    File(String file, int label) {
        this.file = file;
        this.label = label;
    }

    public static int getFileLabel(String file) {
        return Arrays.stream(File.values())
                .filter(chessFile -> chessFile.file.equals(file))
                .map(chessFile -> chessFile.label)
                .findAny()
                .orElse(WRONG.label);
    }
}
