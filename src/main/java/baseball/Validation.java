package baseball;

public class Validation {

    public static boolean isValidInput(String digits, int length) {
        return (isNotNull(digits)
                && isEqualLength(digits, length)
                && isAllDigitsBetweenOneAndNine(digits)
                && isAllDigitsDefferent(digits, length));
    }

    public static boolean isNotNull(String digits) {
        return digits != null;
    }

    public static boolean isEqualLength(String digits, int length) {
        return digits.length() == length;
    }

    public static boolean isAllDigitsDefferent(String digits, int length) {
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (digits.charAt(i) == digits.charAt(j))
                    return false;
            }
        }
        return true;
    }

    public static boolean isAllDigitsBetweenOneAndNine(String digits) {
        for (char digit : digits.toCharArray()) {
            if (digit < '1' || digit > '9')
                return false;
        }
        return true;
    }
}
