package masters.cs16.cs06.controller;

import masters.cs16.cs06.model.Board;
import masters.cs16.cs06.view.InputView;
import masters.cs16.cs06.view.OutputView;

public class ChessGameController {

    Board board;
    InputView inputView;
    OutputView outputView;

    public ChessGameController(InputView inputView, OutputView outputView, Board board) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.board = board;
    }

    public void chessGameStart() {
        outputView.showInitializationMessage();     // 초기화 안내 문구 출력

    }


}
