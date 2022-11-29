package racingcar.view;

import racingcar.domain.CarLineUp;
import static racingcar.utils.ViewMessages.*;

public class OutputView {
    public static void printExecutionResult() {
        System.out.println(OUTPUT_EXECUTION_RESULT);
    }
    public static void printRacingResult(CarLineUp carLineUp) {
        carLineUp.printPlayers();
        System.out.println();
    }
}
