package baseball.domain;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Numbers {
    private List<Integer> numbers;

    public Numbers(String numbers) {
        this.numbers = convertStringToIntList(numbers);;
    }

    private List<Integer> convertStringToIntList(String input) {
        return Arrays.asList(input.split("")).stream()
                .map(x -> Integer.parseInt(x))
                .collect(Collectors.toList());
    }

    public int countSameNumberWithSamePosition(Numbers other) {
        return (int) numbers.stream()
                .filter(number -> numbers.indexOf(number) == other.numbers.indexOf(number))
                .count();
    }

    public int countSameNumberWithDifferentPosition(Numbers other) {
        return (int) numbers.stream()
                .filter(number -> numbers.indexOf(number) != other.numbers.indexOf(number)
                        && other.numbers.contains(number))
                .count();
    }

}
