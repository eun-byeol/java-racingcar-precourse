package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.domain.Car;
import racingcar.domain.CarLineUp;
import racingcar.domain.Winner;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

public class WinnerTest {
    final Winner winner;
    final CarLineUp carLineUp;
    final List<Car> expected;
    static private final int MOVE_CONDITION = 5;

    public WinnerTest() {
        this.carLineUp = createCarLineUp("pobi,woni,jun", Arrays.asList(5, 4, 5));
        this.winner = new Winner(carLineUp);
        this.expected = createCarLineUp("pobi,jun", Arrays.asList(5, 5)).getPlayers();
    }

    private CarLineUp createCarLineUp(String carNames, List<Integer> position) {
        CarLineUp carLineUp = new CarLineUp(carNames);
        for (int i = 0; i < position.size(); i++) {
            setPosition(carLineUp.getPlayers().get(i), position.get(i));
        }
        return carLineUp;
    }

    private void setPosition(Car car, int position) {
        for (int i = 0; i < position; i++) {
            car.move(MOVE_CONDITION);
        }
    }

    @DisplayName("최대 위치의 자동차를 찾는다.")
    @Test
    void findMaxPositionTest() {
        assertThat(winner.findMaxPosition(carLineUp).getName())
                .isEqualTo("pobi");
    }

    @DisplayName("최대 위치와 같은 자동차를 찾는다")
    @Test
    void decideWinnerTest() {
        assertThat(winner.decideWinner(carLineUp).containsAll(expected));
    }
}