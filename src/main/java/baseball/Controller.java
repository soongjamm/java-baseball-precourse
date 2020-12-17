package baseball;

import java.util.Map;
import java.util.Scanner;

public class Controller {
    private final Scanner scanner;

    public Controller(Scanner scanner) {
        this.scanner = scanner;
    }

    public boolean run() {
        ComputerPlayer computer = new ComputerPlayer();
        Player player = new Player();

        do {
            computer.generateRandomNumbers();
            player.enterInput(scanner);
        } while (judgeGame(computer, player));

        return continueGame();

    }

    private boolean continueGame() {

        return false;
    }

    private boolean judgeGame(ComputerPlayer computer, Player player) {
        Map<String, Integer> result = computer.judgeResult(player);
        final int terminateGame = ConstantNumber.Baseball.NUMBERS_LENGTH.getValue();
        int strike = result.get("strike");
        int ball = result.get("ball");

        if (strike == terminateGame) {
            OutputView.printCorrect();
            return true;
        }
        if (strike == 0 && ball == 0) {
            OutputView.printNothing();
        }
        OutputView.printHint(strike, ball);
        System.out.println(result.get("strike") + " " + result.get("ball"));
        return false;
    }
}
