package baseball;

public class Constant {

    public enum GameNumber {
        LENGTH(3);

        private final int value;

        GameNumber(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    public enum BaseballTerm {
        STRIKE("strike", "스트라이크"),
        BALL("ball", "볼"),
        NOTHING("nothhing", "낫싱");

        private final String english;

        BaseballTerm(String english, String korean) {
            this.english = english;
            this.korean = korean;
        }

        public String english() {
            return english;
        }

        public String korean() {
            return korean;
        }

        private final String korean;

    }

    public enum ContinueGameSelection {
        CONTINUE("1"),
        FINISH("2");

        private final String value;

        ContinueGameSelection(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public boolean equals(String input) {
            return value.equals(input);
        }

    }

    public enum RandomRange {
        START_INCLUSIVE(1),
        END_INCLUSIVE(9);

        private final int value;

        RandomRange(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

}
