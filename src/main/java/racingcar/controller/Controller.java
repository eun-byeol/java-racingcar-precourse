package racingcar.controller;

import racingcar.domain.CarLineUp;
import racingcar.domain.RacingCount;
import racingcar.domain.Winner;

import static racingcar.view.OutputView.*;
import static racingcar.view.InputView.*;

public class Controller {

    public void runGame() {
        CarLineUp carLineUp = inputCars();
        final RacingCount gameCount = inputGameCount();

        printExecutionResult();
        execution(carLineUp, gameCount);

        printWinner(new Winner(carLineUp));
    }

    private CarLineUp inputCars() {
        while (true) {
            try {
                return new CarLineUp(readCarNames());
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private RacingCount inputGameCount() {
        while (true) {
            try {
                return new RacingCount(readRacingCount());
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void execution(CarLineUp carLineUp, RacingCount gameCount) {
        for (int i = 0; i < gameCount.getCount(); i++) {
            carLineUp.racing();
            printRacingResult(carLineUp);
        }
    }
}