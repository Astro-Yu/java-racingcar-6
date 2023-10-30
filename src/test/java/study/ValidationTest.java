package study;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import racingcar.Validation;


public class ValidationTest {

    @Test
    void name_6자이상_test() {
        String name = "안녕하세요반갑습니다.";
        Assertions.assertThatThrownBy(() -> Validation.validateLengthOfName(name))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("자동차의 이름을 1자 이상, 5자 이하로 설정해주세요.");
    }

    @Test
    void name_0자_test() {
        String name = "";
        Assertions.assertThatThrownBy(() -> Validation.validateLengthOfName(name))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("자동차의 이름을 1자 이상, 5자 이하로 설정해주세요.");
    }

    @Test
    void name_숫자가_아닌_값() {
        String s = "k";
        Assertions.assertThatThrownBy(() -> Validation.isNotNumber(s))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("숫자를 입력해주세요.");
    }
}

