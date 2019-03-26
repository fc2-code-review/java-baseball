package baseball;

public class Main {
    private static final int DIGIT_LENGTH = 3; // 숫자 개수

    public static void main(String[] args) {
        BaseBallGame baseBall = new BaseBallGame(DIGIT_LENGTH);
        baseBall.run();
    }
}
