package racingcar.domain;

import static racingcar.utils.ErrorMessage.*;
import java.util.regex.Pattern;

public class RacingcarGame {
    public void createLineUp(String cars){
        validateCarNames(cars);
    }

    private void validateCarNames(String carNames){
        final String pattern = "^[a-zA-Z,]*$";
        if (!Pattern.matches(pattern, carNames)) {
            throw new IllegalArgumentException(CAR_NAME_NOT_ENGLISH);
        }
    }


}
