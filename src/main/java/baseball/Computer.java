package baseball;

public class Computer {
    private String digits;
    private int length;

    public Computer(int length) {
        this.length = length;
    }

    public void generateDigits() {
        StringBuilder sbDigits = new StringBuilder();

        int cnt = 0;
        while (cnt < length) {
            int digit = (int) (Math.random() * 9) + 1;
            sbDigits.append(digit);

            if (Validation.isAllDigitsDefferent(sbDigits.toString(), cnt+1))
                cnt++;
            else
                sbDigits.deleteCharAt(cnt);
        }
        digits = sbDigits.toString();
    }


    public String getDigits() {
        return digits;
    }
}
