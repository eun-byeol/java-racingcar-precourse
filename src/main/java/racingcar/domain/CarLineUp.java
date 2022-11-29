package racingcar.domain;

import static racingcar.utils.ErrorMessage.*;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class CarLineUp {
    private List<Car> players = new ArrayList<>();
    private final String SEPARATOR = ",";

    public CarLineUp(String cars) {
        validateCarNames(cars);
        String[] names = cars.split(SEPARATOR);
        for (String name : names) {
            players.add(new Car(name));
        }
    }

    private void validateCarNames(String carNames){
        final String pattern = "^[a-zA-Z,]*$";
        if (!Pattern.matches(pattern, carNames)) {
            throw new IllegalArgumentException(CAR_NAME_NOT_ENGLISH);
        }
    }
}
