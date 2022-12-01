package racingcar.domain;

import static racingcar.utils.ErrorMessage.*;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class CarLineUp {
    private List<Car> players = new ArrayList<>();
    private static final String SEPARATOR = ",";
    private static final String PATTERN_OF_NAME = "^[a-zA-Z,]*$";

    public CarLineUp(String cars) {
        validateCarNames(cars);
        String[] names = cars.split(SEPARATOR);
        for (String name : names) {
            players.add(new Car(name));
        }
    }

    private void validateCarNames(String carNames){
        if (!Pattern.matches(PATTERN_OF_NAME, carNames)) {
            throw new IllegalArgumentException(CAR_NAME_NOT_ENGLISH);
        }
    }

    public void racing() {
        for (Car car : players) {
            car.pickRandomNumAndMove();
        }
    }

    public List<Car> getPlayers() {
        return players;
    }
}
