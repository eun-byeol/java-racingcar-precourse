package racingcar.domain;

import static racingcar.utils.RandomNumber.*;
import static racingcar.utils.ErrorMessage.*;

public class Car {
    private final String name;
    private int position = 0;
    private static final int MOVE_CONDITION = 4;

    public Car(String name) {
        validateSize(name);
        this.name = name;
    }

    private void validateSize(String name) {
        if (name.length() < 1 || name.length() > 5) {
            throw new IllegalArgumentException(CAR_NAME_SIZE_OUT_OF_RANGE);
        }
    }

    public void move() {
        if (pickRandomNumber() < MOVE_CONDITION) {
            return;
        }
        position++;
    }

    @Override
    public String toString() {
        String movement = "";
        for (int i = 0; i < position; i++) {
            movement += "-";
        }
        return name + " : " + movement;
    }
}