package racingcar.View;

import static racingcar.Utils.Utils.splitWithComma;
import static racingcar.View.InputValidator.checkBlack;
import static racingcar.View.InputValidator.checkDigit;
import static racingcar.View.InputValidator.checkEmpty;
import static racingcar.View.InputValidator.startAndEndWithComma;

import camp.nextstep.edu.missionutils.Console;
import java.util.List;
import racingcar.Constants.InputViewMessages;

public class InputView {

    public static List<String> getCarNames() {
        System.out.println(InputViewMessages.INSERT_CAR_NAME);
        String carNames = Console.readLine();
        carNameValidator(carNames);

        return splitWithComma(carNames);
    }

    public static int getTryNumber() {
        System.out.println(InputViewMessages.INSERT_TRY_NUMBER);
        String tryNumber = Console.readLine();
        tryNumberValidator(tryNumber);

        return Integer.parseInt(tryNumber);
    }

    private static void tryNumberValidator(String input) {
        checkEmpty(input);
        checkDigit(input);
        checkBlack(input);
    }

    private static void carNameValidator(String input) {
        checkEmpty(input);
        checkBlack(input);
        startAndEndWithComma(input);
    }
}
