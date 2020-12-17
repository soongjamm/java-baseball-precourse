package baseball.domain;

import utils.Constant;
import baseball.view.InputView;
import baseball.view.OutputView;

import java.util.Map;
import java.util.Scanner;

public class Controller {
    private final Scanner scanner;

    public Controller(Scanner scanner) {
        this.scanner = scanner;
    }

    public void run() {
        ComputerPlayer computer = new ComputerPlayer();
        Player player = new Player();

        computer.generateRandomNumbers();
        do {
            player.enterInput(scanner);
        } while (judgeGame(computer, player));

    }

    public boolean continueGame() {
        InputView inputView = new InputView(scanner);
        String input = inputView.askContinueGame();

        if (Constant.ContinueGameSelection.CONTINUE.equals(input)) {
            return true;
        }
        return false;
    }

    private boolean judgeGame(ComputerPlayer computer, Player player) {
        Map<String, Integer> result = computer.judgeResult(player);
        final int terminateGame = Constant.GameNumber.LENGTH.getValue();
        int strike = result.get(Constant.BaseballTerm.STRIKE.english());
        int ball = result.get(Constant.BaseballTerm.BALL.english());

        if (strike == terminateGame) {
            OutputView.printCorrect();
            return false;
        }
        if (strike == 0 && ball == 0) {
            OutputView.printNothing();
        }
        OutputView.printHint(strike, ball);
        return true;
    }
}
