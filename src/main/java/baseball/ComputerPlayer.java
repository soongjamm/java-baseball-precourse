package baseball;

import java.util.List;

public class ComputerPlayer {
    private Numbers numbers;

    public void generateRandomNumbers() {
        RandomNumberGenerator generator = new RandomNumberGenerator();
        numbers = new Numbers(generator.generate());
    }

    public void judgeGame(Player player) {

    }
}
