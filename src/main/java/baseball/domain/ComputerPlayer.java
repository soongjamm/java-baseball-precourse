package baseball.domain;

import utils.Constant;

import java.util.HashMap;
import java.util.Map;

public class ComputerPlayer {
    private Numbers numbers;

    public void generateRandomNumbers() {
        RandomNumberGenerator generator = new RandomNumberGenerator();
        numbers = new Numbers(generator.generate());
    }

    public Map<String, Integer> judgeResult(Player player) {
        Map<String, Integer> result = new HashMap<>();

        result.put(Constant.BaseballTerm.STRIKE.english(), numbers.countSameNumberWithSamePosition(player.numbers()));
        result.put(Constant.BaseballTerm.BALL.english(), numbers.countSameNumberWithDifferentPosition(player.numbers()));

        return result;
    }
}
