package racingcar.domain;

import net.bytebuddy.pool.TypePool;

import java.util.*;
import java.util.stream.Collectors;

public class Winner {
    private final List<Car> winners;

    public Winner(CarLineUp cars) {
        List<Car> winners = new ArrayList<>();
        winners = decideWinner(cars, findMaxPosition(cars));
        this.winners = winners;
    }

    public List<Car> decideWinner(CarLineUp cars, Car carWithMaxPosition) {
        return cars.getPlayers()
                .stream()
                .filter(car -> car.getPosition() == carWithMaxPosition.getPosition())
                .collect(Collectors.toList());
    }

    public Car findMaxPosition(CarLineUp cars) {
        Comparator<Car> comparatorByPosition = Comparator.comparingInt(Car::getPosition);
        return cars.getPlayers()
                .stream()
                .max(comparatorByPosition)
                .orElseThrow(NoSuchElementException::new);
    }

    public List<Car> getWinners() {
        return winners;
    }
}
