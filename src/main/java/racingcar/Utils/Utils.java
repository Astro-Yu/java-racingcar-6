package racingcar.Utils;

import static racingcar.Constants.Constants.COMMA;
import static racingcar.Constants.Constants.MAX_RANGE;
import static racingcar.Constants.Constants.MIN_RANGE;

import camp.nextstep.edu.missionutils.Randoms;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Utils {
    // String을 ,로 구분해서 List로 바꾸는 함수
    public static List<String> splitWithComma(String input) {
        return new ArrayList<>(Arrays.asList(input.split(COMMA)));
    }

    // int input을 천의 자리마다 구분자 ,를 넣어서 String으로 바꾸는 함수
    public static String numberFormat(int input) {
        NumberFormat numberFormat = NumberFormat.getNumberInstance();
        return numberFormat.format(input);
    }

    public static int randomNumberGenerator() {
        return Randoms.pickNumberInRange(MIN_RANGE, MAX_RANGE);
    }
}
