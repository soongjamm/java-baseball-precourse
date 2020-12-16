package baseball;

public class Controller {
    public void run() {
        RandomNumberGenerator generator = new RandomNumberGenerator();
        generator.generate().stream().forEach(x -> System.out.print(x + " "));
    }
}
