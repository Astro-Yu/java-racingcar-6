package racingcar.View;

import static racingcar.Constants.Constants.COMMA;
import static racingcar.Constants.ErrorMessages.INVALID_BLANK_MESSAGE;
import static racingcar.Constants.ErrorMessages.INVALID_COMMA_POSITION_MESSEAGE;
import static racingcar.Constants.ErrorMessages.INVALID_EMPTY_MESSAGE;
import static racingcar.Constants.ErrorMessages.INVALID_INPUT_MESSAGE;

public class InputValidator {

    public static void checkEmpty(String input) {
        if (isEmpty(input)) {
            throw new IllegalArgumentException(INVALID_EMPTY_MESSAGE.getMessage());
        }
    }

    public static void checkBlack(String input) {
        if (isBlank(input)) {
            throw new IllegalArgumentException(INVALID_BLANK_MESSAGE.getMessage());
        }
    }

    public static void checkDigit(String input) {
        if (!isDigit(input)) {
            throw new IllegalArgumentException(INVALID_INPUT_MESSAGE.getMessage());
        }
    }

    public static void startAndEndWithComma(String input) {
        if (startWithComma(input) || endWithComma(input)) {
            throw new IllegalArgumentException(INVALID_COMMA_POSITION_MESSEAGE.getMessage());

        }
    }

    private static boolean isEmpty(String input) {
        return input.isEmpty();
    }

    private static boolean isBlank(String input) {
        return input.isBlank();
    }

    private static boolean isDigit(String input) {
        return Character.isDigit(input.charAt(0));
    }

    private static boolean endWithComma(String input) {
        return input.endsWith(COMMA);
    }

    private static boolean startWithComma(String input) {
        return input.startsWith(COMMA);
    }
}
