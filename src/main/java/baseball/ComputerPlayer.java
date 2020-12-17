package baseball;

import java.util.List;

public class ComputerPlayer {
    private List<Integer> numbers;

    public void generateRandomNumbers() {
        RandomNumberGenerator generator = new RandomNumberGenerator();
        numbers = generator.generate();
    }

    public void judgeGame() {
    }
}
