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
        carLineUp.printPlayers();
        System.out.println();
    }

    public static void printWinner(Winner winner) {
        List<String> winners = new ArrayList<>();
        for (Car car : winner.getWinners()) {
            winners.add(car.getName());
        }
        String result = String.join(", ", winners);
        System.out.printf(OUTPUT_WINNER, result);
    }
}
