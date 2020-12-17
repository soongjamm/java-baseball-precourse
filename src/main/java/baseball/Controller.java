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
        if (result.get("strike") == ConstantNumber.Baseball.NUMBERS_LENGTH.getValue()) {
            OutputView.printCorrect();
            return true;
        }
        if (result.get("strike") == 0 && result.get("ball") == 0) {
            OutputView.printNothing();
        }
        System.out.println(result.get("strike") + " " + result.get("ball"));
        return false;
    }
}
