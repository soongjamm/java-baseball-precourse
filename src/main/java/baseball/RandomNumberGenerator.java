package baseball;

import utils.RandomUtils;

import java.util.ArrayList;
import java.util.List;

public class RandomNumberGenerator {

    public List<Integer> generate() {
        List<Integer> randomNumbers = new ArrayList<>();

        while (randomNumbers.size() < Number.Baseball.NUMBERS_LENGTH.getValue()) {
            int newNumber = RandomUtils.nextInt(
                    Number.RandomRange.START_INCLUSIVE.getValue(),
                    Number.RandomRange.END_INCLUSIVE.getValue());

            if (!randomNumbers.contains(newNumber)) {
                randomNumbers.add(newNumber);
            }
        }
        return randomNumbers;
    }
}
