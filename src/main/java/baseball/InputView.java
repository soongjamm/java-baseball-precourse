package baseball;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class InputView {
    private static final int BASEBALL_NUMBERS_LENGTH = 3;
    private final Scanner scanner;

    public InputView(Scanner scanner) {
        this.scanner = scanner;
    }

    public String inputNumbers() {
        System.out.println("숫자를 입력해주세요 : ");
        return inputNumbersAsList();
    }

    private String inputNumbersAsList() {
        String input = scanner.next();
        try {
            validateNumbersLength(input);
            validateNumbersFormat(input);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return inputNumbers();
        }
        return input;
    }

    private void validateNumbersLength(String input) {
        if (input.length() != ConstantNumber.Baseball.NUMBERS_LENGTH.getValue()) {
            throw new IllegalArgumentException("숫자는 " + 3 + "자리수여야 합니다.");
        }
    }

    private void validateNumbersFormat(String input) {
        for (char c : input.toCharArray()) {
            if (!Character.isDigit(c)) {
                throw new IllegalArgumentException("입력은 숫자여야 합니다.");
            }
        }
    }

}
