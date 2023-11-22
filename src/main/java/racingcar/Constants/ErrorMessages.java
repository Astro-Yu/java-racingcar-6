package racingcar.Constants;

public enum ErrorMessages {
    ERROR_PREFIX("[ERROR] "),
    INVALID_BLANK_MESSAGE("공백은 입력할 수 없습니다."),
    INVALID_EMPTY_MESSAGE("아무 값도 입력하지 않았습니다."),
    INVALID_INPUT_MESSAGE("숫자만 입력할 수 있습니다."),
    INVALID_NAME_LENGTH_MESSAGES("차 이름은 1자 이상, 5자 이하만 가능합니다."),
    INVALID_COMMA_POSITION_MESSEAGE("이름의 시작과 끝에 ,(Comma)를 붙이지 마세요"),
    INVALID_DUPLICATED_MESSAGE("자동차 이름은 중복될 수 없습니다.");

    private String message;

    ErrorMessages(String message) {
        this.message = message;
    }

    public String getMessage() {
        return ERROR_PREFIX.message + message;
    }
}
