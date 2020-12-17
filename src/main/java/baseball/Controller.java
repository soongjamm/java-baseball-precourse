package baseball;

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
        if (ConstantNumber.ContinueGameSelection.CONTINUE.equals(input)) {
            return true;
        }
        return false;
    }

    private boolean judgeGame(ComputerPlayer computer, Player player) {
        Map<String, Integer> result = computer.judgeResult(player);
        final int terminateGame = ConstantNumber.Baseball.NUMBERS_LENGTH.getValue();
        int strike = result.get("strike");
        int ball = result.get("ball");

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
