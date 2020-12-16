package baseball;

import java.util.Scanner;

public class Controller {
    private final Scanner scanner;

    public Controller(Scanner scanner) {
        this.scanner = scanner;
    }

    public void run() {
        RandomNumberGenerator generator = new RandomNumberGenerator();
        generator.generate().stream().forEach(x -> System.out.print(x + " "));
        System.out.println();

        InputView inputView = new InputView(scanner);
        System.out.println(inputView.inputNumbers());
    }
}
