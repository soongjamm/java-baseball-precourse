package baseball;

import utils.RandomUtils;

public class RandomNumberGenerator {

    public String generate() {
        String randomNumbers = "";

        while (randomNumbers.length() < ConstantNumber.Baseball.NUMBERS_LENGTH.getValue()) {
            String newNumber = Integer.toString(RandomUtils.nextInt(
                    ConstantNumber.RandomRange.START_INCLUSIVE.getValue(),
                    ConstantNumber.RandomRange.END_INCLUSIVE.getValue()));

            if (!randomNumbers.contains(newNumber)) {
                randomNumbers += newNumber;
            }
        }
        return randomNumbers;
    }
}
