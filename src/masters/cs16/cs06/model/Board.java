package masters.cs16.cs06.model;

import masters.cs16.cs06.model.pieces.Pawn;
import masters.cs16.cs06.model.pieces.Piece;
import masters.cs16.cs06.model.pieces.Position;

public class Board {

    public Object[][] board = new Object[8][8];     // 2차원 객체 배열

    public void fillBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                
            }
        }
    }

    public void initPiece(Piece chessPiece, Position position) {      // 보드판 초기화 담당 메서드

    }

//    public String[][] display() {
//        String[][] boardString = new String[8][8];
//
//    }
}
