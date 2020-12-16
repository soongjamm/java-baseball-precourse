package baseball;

public class Number {

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
