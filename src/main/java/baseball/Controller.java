package baseball;

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

        computer.judgeGame(player);

    }
}
