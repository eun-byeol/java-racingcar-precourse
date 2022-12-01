package racingcar.domain;

import static racingcar.utils.ErrorMessage.*;
import static racingcar.utils.RandomNumber.pickRandomNumber;

public class Car {
    private final String name;
    private int position = 0;
    private static final int MIN_LENGTH_OF_NAME = 1;
    private static final int MAX_LENGTH_OF_NAME = 5;
    private static final int CONDITION_OF_MOVE = 4;

    public Car(String name) {
        validateSize(name);
        this.name = name;
    }

    private void validateSize(String name) {
        if (name.length() < MIN_LENGTH_OF_NAME || name.length() > MAX_LENGTH_OF_NAME) {
            throw new IllegalArgumentException(CAR_NAME_SIZE_OUT_OF_RANGE);
        }
    }

    public void pickRandomNumAndMove() {
        move(pickRandomNumber());
    }

    public void move(int number) {
        if (number < CONDITION_OF_MOVE) {
            return;
        }
        position++;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }
}