package baseball;

import utils.RandomUtils;

public class RandomNumberGenerator {

    public String generate() {
        String randomNumbers = "";

        while (randomNumbers.length() < Constant.GameNumber.LENGTH.getValue()) {
            String newNumber = Integer.toString(RandomUtils.nextInt(
                    Constant.RandomRange.START_INCLUSIVE.getValue(),
                    Constant.RandomRange.END_INCLUSIVE.getValue()));

            if (!randomNumbers.contains(newNumber)) {
                randomNumbers += newNumber;
            }
        }
        return randomNumbers;
    }
}
