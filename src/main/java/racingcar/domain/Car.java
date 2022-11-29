package racingcar.domain;

import static racingcar.utils.ErrorMessage.*;

public class Car {
    private final String name;
    private int position = 0;

    public Car(String name) {
        validateSize(name);
        this.name = name;
    }

    private void validateSize(String name) {
        if (name.length() < 1 || name.length() > 5) {
            throw new IllegalArgumentException(CAR_NAME_SIZE_OUT_OF_RANGE);
        }
    }
}