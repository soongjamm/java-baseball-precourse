package baseball;

public class OutputView {
    public static void printNothing() {
        System.out.println("낫싱");
    }

    public static void printHint() {

    }

    public static void printCorrect() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }

    public static void printHint(int strike, int ball) {
        String message = "";
        if (ball != 0) {
            message += String.format("%d볼 ", ball);
        }
        if (strike != 0) {
            message += String.format("%스트라이크", strike);
        }
        System.out.println(String.format(message));
    }
}
