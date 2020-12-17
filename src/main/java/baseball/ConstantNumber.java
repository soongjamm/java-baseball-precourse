package baseball;

public class ConstantNumber {

    public enum Baseball {
        NUMBERS_LENGTH(3);

        private final int value;

        Baseball(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
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
