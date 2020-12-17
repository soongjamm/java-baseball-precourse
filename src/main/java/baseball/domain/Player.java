package baseball.domain;

import baseball.view.InputView;

import java.util.Scanner;

public class Player {
    private Numbers numbers;

    public void enterInput(Scanner scanner) {
        InputView inputView = new InputView(scanner);
        numbers = new Numbers(inputView.inputNumbers());
    }

    public Numbers numbers() {
        return numbers;
    }
}
