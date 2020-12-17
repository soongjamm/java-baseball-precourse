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
        player.enterInput(scanner);

        judgeGame(computer, player);

    }

    private boolean judgeGame(ComputerPlayer computer, Player player) {
        Map<String, Integer> result = computer.judgeResult(player);
        System.out.println(result.get("strike") + " " + result.get("ball"));
        return true;
    }
}
