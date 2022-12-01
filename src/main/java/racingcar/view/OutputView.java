package racingcar.view;

import racingcar.domain.Car;
import racingcar.domain.CarLineUp;
import racingcar.domain.Winner;
import java.util.*;

import static racingcar.utils.ViewMessages.*;

public class OutputView {
    public static void printExecutionResult() {
        System.out.println(OUTPUT_EXECUTION_RESULT);
    }
    public static void printRacingResult(CarLineUp carLineUp) {
        for (Car car : carLineUp.getPlayers()) {
            printPlayers(car);
        }
        System.out.println();
    }

    private static void printPlayers(Car car) {
        System.out.printf(OUTPUT_PLAYER_NAME, car.getName());
        for (int i = 0; i < car.getPosition(); i++) {
            System.out.print(OUTPUT_MOVEMENT);
        }
        System.out.println();
    }

    public static void printWinner(Winner winner) {
        List<String> winners = new ArrayList<>();
        for (Car car : winner.getWinners()) {
            winners.add(car.getName());
        }
        String result = String.join(OUTPUT_SEPARATOR, winners);
        System.out.printf(OUTPUT_WINNER, result);
    }
}
