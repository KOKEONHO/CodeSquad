package masters.cs16.cs06;

import masters.cs16.cs06.controller.ChessGameController;
import masters.cs16.cs06.model.Board;
import masters.cs16.cs06.model.pieces.File;
import masters.cs16.cs06.model.pieces.Rank;
import masters.cs16.cs06.view.InputView;
import masters.cs16.cs06.view.OutputView;

import java.util.StringTokenizer;

public class Application {
    public static void main(String[] args) {
//
//        InputView inputView = new InputView();
//        OutputView outputView = new OutputView();
//        Board board = new Board();
//        ChessGameController chessGameController = new ChessGameController(inputView, outputView, board);
//        chessGameController.chessGameStart();
        String userInput = "C 4";
        StringTokenizer st = new StringTokenizer(userInput);
        String file = st.nextToken();
        String rank = st.nextToken();
        System.out.println("[" + Rank.getRankLabel(rank) + "][" + File.getFileLabel(file) + "]");
    }
}
