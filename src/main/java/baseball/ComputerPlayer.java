package baseball;

import java.util.HashMap;
import java.util.Map;

public class ComputerPlayer {
    private Numbers numbers;

    public void generateRandomNumbers() {
        RandomNumberGenerator generator = new RandomNumberGenerator();
        numbers = new Numbers(generator.generate());
        System.out.println(numbers.numbers());
    }

    public Map<String, Integer> judgeResult(Player player) {
        Map<String, Integer> result = new HashMap<>();

        result.put("strike", numbers.countSameNumberWithSamePosition(player.numbers()));
        result.put("ball", numbers.countSameNumberWithDifferentPosition(player.numbers()));

        return result;
    }
}
