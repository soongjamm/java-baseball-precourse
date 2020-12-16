package baseball;

import utils.RandomUtils;

import java.util.ArrayList;
import java.util.List;

public class RandomNumberGenerator {
    private static final int START_INCLUSIVE = 1;
    private static final int END_INCLUSIVE = 9;
    private static final int BASEBALL_NUMBERS_LENGTH = 3;

    public List<Integer> generate() {
        List<Integer> randomNumbers = new ArrayList<>();

        while (randomNumbers.size() < BASEBALL_NUMBERS_LENGTH) {
            int newNumber = RandomUtils.nextInt(START_INCLUSIVE, END_INCLUSIVE);
            if (!randomNumbers.contains(newNumber)) {
                randomNumbers.add(newNumber);
            }
        }
        return randomNumbers;
    }
}
