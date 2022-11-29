package racingcar.utils;

public class ErrorMessage {
    public static final String ERROR_TAG = "[ERROR] ";
    public static final String CAR_NAME_NOT_ENGLISH = ERROR_TAG + "자동차 이름은 공백을 제외한 영문자만 가능합니다.";
    public static final String CAR_NAME_SIZE_OUT_OF_RANGE = ERROR_TAG + "자동차 이름은 1자 이상 5자 이하만 가능합니다.";
    public static final String CAR_NAME_SEPARATOR_IS_NOT_VALID = ERROR_TAG + "자동차 이름은 공백을 없이 쉼표로 구분하여 입력해야 합니다.";
    public static final String RACING_COUNT_OUT_OF_RANGE = ERROR_TAG + "시도 회수는 0보다 큰 정수만 가능합니다.";
}