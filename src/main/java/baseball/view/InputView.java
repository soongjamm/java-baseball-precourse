package baseball.view;

import utils.Constant;

import java.util.Scanner;

public class InputView {
    private final Scanner scanner;

    public InputView(Scanner scanner) {
        this.scanner = scanner;
    }

    public String askContinueGame() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        try {
            String input = scanner.nextLine().trim();
            validateNumbersFormat(input);
            validateAskContinueGame(input);
            return input;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return askContinueGame();
        }
    }

    private void validateAskContinueGame(String input) {
        if (!Constant.ContinueGameSelection.CONTINUE.equals(input)
            && !Constant.ContinueGameSelection.FINISH.equals(input)) {
            throw new IllegalArgumentException("존재하지 않는 기능입니다.");
        }
    }


    public String inputNumbers() {
        System.out.println("숫자를 입력해주세요 : ");
        return inputNumbersAsList();
    }

    private String inputNumbersAsList() {
        String input = scanner.nextLine().trim();
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
        if (input.length() != Constant.GameNumber.LENGTH.getValue()) {
            throw new IllegalArgumentException("숫자는 " + Constant.GameNumber.LENGTH.getValue() + "자리수여야 합니다.");
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
